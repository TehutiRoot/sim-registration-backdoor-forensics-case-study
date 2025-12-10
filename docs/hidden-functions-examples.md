# Hidden Function Examples & Interpretation

This document provides **clear, readable examples of reconstructed source code** for the hidden functions identified in the SIM registration app, together with commentary on:

- What each function appears to do.
- How it relates to the backdoor flows documented in this case study.
- What evidence exists about *when* the logic was introduced or changed.
- Whether the behaviour is more consistent with intentional use than with simple testing or bugs.

All code below is **pseudocode / decompiled style**, with names and values anonymised.

---

## 1. Fallback Trigger – Fake-Fail Face Recognition

### Example function (pseudocode)

function handleFaceScanResult(attempt, isMatch, config) {

text
if config.flowType != "NORMAL_REGISTRATION":
    // other flows handle their own logic
    return

if not isMatch:
    log("FACE_SCAN_FAIL", { "attempt": attempt })

    if attempt >= config.maxFaceAttemptsBeforeFallback:
        enableFallbackMode()
        showManualUploadScreen()
        log("FALLBACK_TRIGGERED", { "reason": "MAX_ATTEMPTS_REACHED" })
    else:
        promptRetryFaceScan()
else:
    proceedToNextStep()
}

text

### Forensic interpretation

- The `maxFaceAttemptsBeforeFallback` parameter is not a generic UI constant; it is retrieved from server configuration and can vary per flow or dealer profile.  
- When the maximum is reached, the function **always** enables a weaker “manual upload” mode instead of enforcing a hard stop or escalation.

### Evidence on timing & intent

- Code diffing between APK versions shows that:
  - Earlier builds either lacked this branch entirely or had a hard-coded fallback that did **not** automatically continue registration.  
  - The dynamic, config-controlled `maxFaceAttemptsBeforeFallback` appeared in later versions around the time new dealer campaigns were introduced (timeline referenced in `docs/timeline.md`).  
- The combination of server-controlled parameter + automatic continuation strongly suggests a **deliberate design** to keep registrations flowing, rather than a simple test hook or error handler.

---

## 2. VIP / Test Profile Bypass

### Example function (pseudocode)

function shouldBypassBiometric(config, userProfile) {

text
if config.flags.byPass == true:
    log("BYPASS_ENABLED", {
        "dealerId": userProfile.dealerId,
        "profileType": userProfile.profileType
    })
    return true

return false
}

function runRegistrationFlow(config, userProfile) {

text
if shouldBypassBiometric(config, userProfile):
    markKycStatus("SKIPPED_BY_SERVER")
    goToSuccessScreen()
    return

runFullKycFlow()
}

text

### Forensic interpretation

- The bypass decision is not gated by a “debug/test build” check; it is purely data-driven from `config.flags.byPass`.  
- Logging of `dealerId` and `profileType` indicates the system expects this path to be **used in practice**, not only in isolated QA.

### Evidence on timing & intent

- Version history showed the `byPass` flag introduced alongside a new “VIP/test” profile type in server responses.  
- Dynamic tests in the lab confirmed:
  - Normal dealers never receive `byPass = true`.  
  - Special accounts (labelled as test/VIP by the operator) receive the flag and immediately skip biometric steps.
- This pattern is consistent with a **production feature** for privileged users, not a one-off debug shortcut.

---

## 3. RTR Laundering – Relaxed Re-Registration

### Example function (pseudocode)

function configureRtrFlow(config, subscriberStatus) {

text
if config.flowType != "RTR_LAUNDERING":
    return runFullKyc()

if subscriberStatus == "PRE_REGISTERED":
    requiredImages   = ["ID_FRONT"]
    optionalImages   = config.optionalImages or ["FACE", "ID_BACK"]

    log("RTR_FLOW", {
        "requiredImages": requiredImages,
        "optionalImages": optionalImages
    })

    startRtrUpdate(requiredImages, optionalImages)
else:
    runFullKyc()
}

text

### Forensic interpretation

- When the backend reports `PRE_REGISTERED`, the client **systematically reduces** biometric requirements.  
- Optional images often include `FACE`, meaning a face photo can be omitted entirely while still completing the flow.

### Evidence on timing & intent

- Server configs from multiple dates showed `flowType = RTR_LAUNDERING` used only for specific classes of numbers and identities.  
- Logs captured in the lab connected RTR responses directly to flows where minimal images were supplied but registrations still succeeded.  
- The consistent, guarded branching on `PRE_REGISTERED` suggests a planned “reuse existing KYC” mechanism, with side‑effects that enable laundering.

---

## 4. MRTR Mass-Production – Multi-SIM Factory Mode

### Example function (pseudocode)

function startRegistration(config, numberPoolInfo) {

text
if config.flowType == "MRTR_MASS_PRODUCTION" and
   config.isNumberingPooling == true and
   numberPoolInfo.isEligible == true:

    openMultiSimFragment(
        maxBatchSize = config.maxBatchSize or 100,
        requiredImagesPerBatch = ["ID_FRONT"],
        optionalImagesPerBatch = ["FACE"]
    )
    log("MRTR_FLOW_ENABLED", {
        "poolId": numberPoolInfo.id,
        "maxBatchSize": config.maxBatchSize
    })
else:
    openSingleSimFragment()
}

text

### Forensic interpretation

- The presence of a dedicated `MultiSimFragment` indicates bulk registration was a first-class feature, not a side-effect.  
- The `optionalImagesPerBatch` structure shows that biometric capture can be reduced or skipped when operating in batch mode.

### Evidence on timing & intent

- Bulk registration code appears in the same release window as marketing material targeting high-volume dealers (based on external context, not published here).  
- Version diffs show the multi-SIM fragment and related config keys were added together and later refined, which is typical for a **maintained production feature**.  
- Logs in `artifacts/logs/example-registration-log.txt` demonstrate successful activation of large batches without biometric evidence.

---

## 5. Why These Are Unlikely to Be “Just Test Hooks”

Across all functions above, several common characteristics emerge:

- **Config-driven behaviour**  
  - Key decisions depend on server-side flags (`flowType`, `byPass`, `isNumberingPooling`) and not on build variants like “debug” vs “release”.  
- **Versioned evolution**  
  - Features appear, are renamed and refined across multiple versions, matching business changes rather than short-lived tests.  
- **Integrated logging**  
  - Logs capture dealer IDs, profile types, pool IDs and batch sizes — information only useful if the flows are expected to run in production.  
- **End-to-end success paths**  
  - Each branch leads to a complete registration success path, not to a diagnostic screen or developer-only output.

Taken together, these factors provide strong evidence that the hidden logic was **intended for real operational use**, even if only for selected dealers, profiles or number pools, rather than being accidental leftovers from development.

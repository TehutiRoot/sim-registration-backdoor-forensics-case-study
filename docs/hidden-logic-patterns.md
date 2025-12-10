# Hidden Logic Patterns (Conceptual)

This document describes the backdoor behaviours identified in the app at a conceptual level.  
No live exploit code is provided; examples use pseudocode and neutral names.

---

## Pattern 1 – Fake‑Fail Fallback

**Intent:** Force biometric capture to "fail" and push users into a weaker manual path.

**Conceptual flow:**
Start Face Scan
-> Attempt 1: app reports "fail"
-> Attempt 2: app reports "fail"
-> Attempt 3: app reports "face not recognised" AND triggers Fallback Mode
Fallback Mode:
-> Show "Upload image" / "Manual review" option
-> Accept static photo instead of live capture

text

**Key indicators:**

- Configuration fields controlling max attempts and fallback behaviour.  
- UI strings and code paths that only appear when a certain flag is set.

---

## Pattern 2 – VIP / Test Bypass

**Intent:** Allow selected profiles to skip biometric steps entirely.

**Conceptual pseudocode:**

config = fetchServerConfig(userProfile)

if config.byPass == true:
// VIP or test profile
skipFaceScan()
goToSuccess()
else:
runNormalKYC()

text

**Key indicators:**

- Server responses that set `byPass` or equivalent flags only for certain accounts.  
- Code branches that short‑circuit validation when that flag is true.

---

## Pattern 3 – RTR Laundering

**Intent:** Reuse existing KYC records to avoid full verification for subsequent actions.

**Conceptual behaviour:**

- App sends ICCID or subscriber ID to backend.  
- Backend responds that record is already present and returns relaxed config:
  - `optionalImages = ["FACE", "ID"]` instead of strict required list.  
- Dealer can proceed with minimal checks, effectively laundering an old registration into a new context.

---

## Pattern 4 – Mass Production / Multi‑SIM

**Intent:** Activate many SIMs in one operation with reduced per‑SIM verification.

**Conceptual behaviour:**

- App checks whether the selected number range belongs to a special pool.  
- If `isNumberingPooling == true`, the app:
  - Opens a multi‑SIM registration fragment.  
  - Accepts one identity document.  
  - Treats biometric capture as optional.  
  - Submits activation for a batch of SIMs.

---

Each pattern is illustrated as a diagram in `flows/` and backed by sanitised artefacts in `artifacts/`.
5) docs/redaction-and-ethics.md
text
# Redaction & Ethics

This lab is designed to educate and to support defensive work, not to enable fraud.

## Redaction Principles

- All real:
  - package names,
  - domains,
  - phone numbers,
  - identity numbers,
  - account IDs
  have been replaced with neutral placeholders such as:
  - `com.example.kycapp`
  - `kyc-api.example.com`
  - `+66XXXXXXXXX`
  - `ID-XXXXXX`

- Configuration and code snippets are simplified into:
  - pseudocode,
  - generic JSON structures,
  - diagrams that do not reveal proprietary implementation details.

- No valid credentials or production endpoints are included.

## Intended Audience & Use

- Digital forensics practitioners and incident responders.  
- Security engineers and auditors responsible for KYC and SIM registration systems.  
- Regulators and policy makers who need concrete examples of systemic weaknesses.

Any use of the techniques or patterns described here must comply with local law and professional ethics.

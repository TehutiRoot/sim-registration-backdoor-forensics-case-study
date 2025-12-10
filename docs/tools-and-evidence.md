# Tools, Process & Points of Proof

This document lists the main tools and techniques used in this lab, and explains which parts of the analysis they support.  
It is intended to answer common objections such as “maybe it was just a UI bug” or “this is only a theory”.

---

## 1. Static Application Analysis

### Tools & Techniques

- APK acquisition from multiple public and dealer channels (hashes recorded).  
- APK decompilation / unpacking (e.g. JADX / apktool‑style workflows).  
- Text and code search across decompiled sources and resources (e.g. grep, ripgrep).

### What this proves

- The presence of configuration keys and code paths that are **never exposed in normal UI**, such as:
  - flags equivalent to `byPass`, `isNumberingPooling`, `optionalImages`, `isAllowCamera`.  
- The existence of multiple registration flows (single SIM, re‑registration, multi‑SIM) encoded in the app logic.  
- That these branches are not “dead code”: they are wired to real network calls and UI fragments.

**Objections answered**

- *“Maybe these flags are for future features or tests only.”*  
  Static analysis showed they are used in active code paths and referenced by live network responses (see dynamic analysis below).

---

## 2. Configuration & Network Forensics

### Tools & Techniques

- HTTP(S) interception / capture in a controlled lab (e.g. proxy / packet capture with certificates installed on test devices).  
- Normalisation of JSON / protobuf configuration structures for comparison across scenarios.  
- Differential analysis of server responses when using:
  - normal dealer accounts vs “special” test/VIP accounts,  
  - normal number ranges vs special SIM pools.

### What this proves

- Backend responses set concrete values for key fields which directly control client behaviour, for example:
  - enabling or disabling camera use,  
  - switching required images to optional,  
  - enabling multi‑SIM registration screens.  
- Hidden flows are **server‑driven**, not accidents on the device:
  - the same app build behaves securely or insecurely depending on flags coming from the server.

**Objections answered**

- *“This is just a misconfigured client; the server is still safe.”*  
  Captured responses show the server knowingly sends relaxed or bypass configurations for certain profiles and number pools.

---

## 3. Behavioural Testing in a Lab

### Tools & Techniques

- Test devices / emulators registered with mock dealer accounts.  
- Controlled sequences following each reconstructed flow:
  - repeated face‑scan attempts,  
  - RTR / re‑registration using already‑registered identities,  
  - bulk activation attempts on special number ranges.  
- Correlation of captured traffic, logs and UI behaviour with flow diagrams.

### What this proves

- The **fake‑fail fallback** actually occurs when the relevant flag is present:
  - face scans “fail” in a deterministic pattern and the app exposes manual upload paths not visible otherwise.  
- VIP/test profiles with specific server flags really **skip biometric steps** and reach a success state.  
- The **mass‑production flow** allows activation of multiple SIMs using one identity in a single transaction, matching the multi‑SIM configuration from the server.

**Objections answered**

- *“This is only static speculation; the behaviour might never happen in practice.”*  
  Repeated lab runs reproduce the same behaviour while configuration values and logs are recorded, showing it is deterministic and controllable.

---

## 4. Cross‑Version & Cross‑Artefact Correlation

### Tools & Techniques

- Comparing multiple APK versions and configuration files over time.  
- Correlating:
  - changes in code and config keys,  
  - changes in dealer workflows observed in the field (documented in notes/slides),  
  - backdoor‑like behaviour in lab replays.

### What this proves

- Certain bypass features **appear, disappear, or are renamed** in tandem with business changes (for example, new dealer campaigns or regulatory deadlines).  
- Hidden flows are not random bugs but maintained features:
  - they evolve, not just appear once.

**Objections answered**

- *“If this were a backdoor, it would not change between versions like that.”*  
  Systematic changes strongly indicate deliberate design and ongoing maintenance.

---

## 5. Integrity & Ethics of the Analysis

### Redaction and Mocking

- All personally identifiable information, real domains, production endpoints and credentials are removed or replaced with placeholders.  
- Code and configuration examples in this repository are:
  - simplified into pseudocode,
  - normalised into generic JSON structures,
  - stripped of any values that could be abused directly.

### Professional Boundaries

- The lab uses **only** artefacts legitimately obtained for analysis and does not attempt unauthorised access to live systems.  
- The methodology is presented so that:
  - defenders can recognise similar patterns in their own environments,  
  - regulators understand how server‑controlled backdoors can exist in otherwise “compliant” apps,  
  - offensive misuse is discouraged by absence of live exploit code or real infrastructure details.

---

By combining static analysis, configuration forensics, controlled behavioural testing and cross‑version correlation, this lab demonstrates a complete chain of evidence that the application’s behaviour is not accidental but governed by hidden, server‑driven logic.

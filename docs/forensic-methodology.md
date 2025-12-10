# Forensic Methodology

This section describes the investigation workflow used to uncover and prove the hidden logic in the SIM registration app.  
The same approach can be reused for other high‑risk applications.

## 1. Acquisition & Versioning

- Collect multiple versions of the APK from different channels (official store, dealer distribution, backups).  
- Record hashes, version codes, and timestamps.  
- Maintain a simple inventory so changes in logic can be tied to specific releases.

## 2. Static Application Analysis

- Decompile APKs to inspect:
  - `AndroidManifest.xml` for permissions, exported components and feature flags.  
  - Configuration APKs and resource bundles used for language and region variants.  
  - Network client code responsible for fetching runtime configuration from the backend.
- Identify modules related to:
  - Face recognition / camera handling.  
  - Dealer workflows (new registration, re‑registration, bulk registration).  
  - Feature toggles and flags.

## 3. Configuration & Behaviour Mapping

- Extract and normalise configuration structures (for example JSON, XML, protobuf).  
- Map key fields such as:
  - `optionalImages`  
  - `isAllowCamera`  
  - `isNumberingPooling`  
  - `byPass` or equivalent flags
- Correlate these fields with observed UI behaviour while driving the app through each flow.

## 4. Dynamic Analysis & Lab Testing

- Build a controlled lab:
  - Test devices / emulators running the app.  
  - Proxy or capture tools to log HTTP(S) requests and responses (URLs and credentials anonymised).  
  - Simulated dealer accounts and number pools (mock data only).
- Exercise different scenarios:
  - Normal single‑SIM registration.  
  - Edge cases (pre‑registered numbers, “special” dealer profiles, pre‑marked SIM pools).  
  - Repeated face‑scan failures to test fallback behaviour.

## 5. Systemic Risk Assessment

- Estimate how each hidden flow could be abused:
  - Number of SIMs that can be registered per identity.  
  - Ability to avoid or weaken biometric binding.  
  - Potential for ghost SIM pools and anonymous communication.  
- Translate findings into recommendations for regulators, operators, and auditors.


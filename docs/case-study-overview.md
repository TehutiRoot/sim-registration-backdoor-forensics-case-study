# Case Study Overview

## Real-World Background (Sanitised)

This case originates from a production SIM registration application used by dealers in a national mobile network.  
The application’s official purpose was to enforce full KYC requirements for every SIM card, including:

- Capturing a live facial biometric for each registration.  
- Binding each SIM to a unique, verified identity document.

During an independent forensic review, several **hidden flows** were discovered where server-side configuration allowed these controls to be weakened or bypassed without the knowledge of end-users or regulators.

All names, domains and personal identifiers in this repository are anonymised, but the control logic and investigative process reflect the original system.

## Key Backdoor Flows Identified

1. **Fake-Fail Face Recognition Flow**

- The app repeatedly prompts for a face scan.  
- After a configured number of “failing” attempts, it automatically switches into a fallback mode.  
- In this mode, the dealer can proceed by uploading static images instead of capturing a live face, effectively downgrading biometric assurance.

2. **Direct VIP / Test Bypass Flow**

- When the backend marks a profile as VIP/test (via configuration flags), the app receives a payload that sets a bypass flag.  
- If this flag is present, the app skips face recognition entirely and jumps directly to a successful registration state.

3. **RTR / Re-Registration Laundering Flow**

- For SIMs or identities already present in the system, the app requests special RTR (re-registration) handling.  
- The server replies with relaxed configuration (e.g. turning mandatory images into optional ones), enabling dealers to migrate or repurpose numbers without full KYC.

4. **Mass-Production (Multi-SIM) Flow**

- Certain number pools are flagged as eligible for multi-SIM processing.  
- In these cases, the app opens a multi-subscriber screen where one identity can be associated with many SIMs in a single operation.  
- Biometric capture becomes optional or is not strictly enforced.

Each of these flows is backed by diagrams in the `flows/` directory and by sanitised artefacts in `artifacts/`.

## Impact

Combined, these backdoor flows make it technically possible to:

- Create large volumes of poorly-attributed or anonymous SIM cards.  
- Recycle identities and registrations in ways that defeat regulatory intent.  
- Hide the true level of KYC enforcement behind server-side flags that are invisible in the official user documentation.

The rest of this repository explains how these behaviours were proven using reproducible forensic techniques.

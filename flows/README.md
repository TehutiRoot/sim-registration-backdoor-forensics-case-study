## Flow 1 – RTR Laundering Flow (Re‑Using Existing Registrations)

<img width="729" height="955" alt="1  Flow RTR Laundering (The RTR Laundering Flow)-en" src="https://github.com/user-attachments/assets/b264fff1-e2d4-48f5-b7b3-c4fe79adf452" />

This flow illustrates how the application handles SIMs or identities that are already present in the registration system (RTR – Re‑Type Registration).  
Instead of enforcing a full KYC process again, the server returns a special configuration that relaxes requirements (for example, treating biometric and ID images as optional), effectively laundering an old registration into a new context.

---

## Flow 2 – MRTR Mass‑Production Flow (Factory Mode for SIMs)

<img width="500" height="955" alt="2  Flow MRTR Mass Production (The MRTR Mass Production Flow)-en" src="https://github.com/user-attachments/assets/88d132ab-747f-4073-a9ab-1c91d9d0cd55" />

This diagram shows the MRTR “mass production” mode, where specific number pools are marked by the server as eligible for multi‑SIM processing.  
When this flag is active, the app allows a dealer to input one identity, treat biometric capture as optional, and submit a batch activation for many SIMs in a single transaction.

---

## Flow 3 – Direct VIP Bypass Flow (Fast Lane Without Biometrics)

<img width="830" height="955" alt="3  Flow VIP Fast Lane (The Direct Bypass Flow)-en" src="https://github.com/user-attachments/assets/16a58c6c-ed2c-45c2-ab21-2c2aaf61d246" />

The VIP Bypass Flow illustrates how the backend can mark certain profiles as “special” (VIP or test accounts) using configuration flags.  
When the app receives these flags, it skips the face‑scan step entirely and moves straight to a successful registration, proving that biometric enforcement can be disabled remotely for selected users.

---

## Flow 4 – Fallback Trigger Flow (Fake‑Fail to Unlock a Weaker Path)

<img width="507" height="955" alt="4  Flow Fallback Trigger (The Fallback Trigger Flow)-en" src="https://github.com/user-attachments/assets/4e64aeef-c96c-4d53-a47a-1609156daac6" />

This flow models the “fake‑fail” behaviour in the face‑recognition step.  
The app repeatedly reports scan failures and, after a configured number of attempts, automatically triggers a fallback mode where the dealer can proceed via manual or static image upload, significantly weakening the biometric guarantees of the registration process.

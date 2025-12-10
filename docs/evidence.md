## Proving the Existence of Hidden Backdoor Logic

This lab does not merely *allege* that the registration app contained backdoors – it demonstrates them through multiple, independent lines of technical evidence:

1. **APK Structure & Configuration Bundles**

   - The extracted application package contains the main APK plus a series of language‑specific `config.xx.apk` files and a configuration cache directory, all controlled by the same package.[file:b94a4fe9-70ec-4e49-ba49-c9f691b565f9]  
   - Inside these bundles, we see JSON‑style configuration blocks (sanitised here) that determine:
     - Which images are required for a given flow (`optionalImages = ["FACE", "ID"]` vs `["ALL"]`).  
     - Whether the camera is allowed or forcibly disabled for that flow (`isAllowCamera = false`).  
     - Whether a multi‑SIM batch mode is active (`isNumberingPooling = true`).[file:b94a4fe9-70ec-4e49-ba49-c9f691b565f9]

   The presence of these flags alone does not prove abuse – but they exactly match the behaviours reconstructed in the forensic flows below.

2. **Reproducible Behavioural Flows (with Diagrams)**

   Using a controlled lab environment, the app was driven through multiple scenarios while its behaviour was recorded.  
   The resulting flows are documented as diagrams in this repository:

   - **Fallback Trigger Flow** – repeated face‑scan failures leading to a manual upload path after a specific number of attempts.[image:2][file:d3fcd8ce-fd04-4035-8d78-4da7681fe23c]  
   - **Direct VIP Bypass Flow** – when the server marks a user as VIP/test, the app skips camera activation and proceeds directly to a success state.[image:3][file:123d34ea-b7c8-4ec0-a918-f6e0a8c55d51]  
   - **RTR Laundering Flow** – a path where pre‑registered identities are “re‑used” via special config, avoiding normal KYC checks.[image:5][file:d3fcd8ce-fd04-4035-8d78-4da7681fe23c]  
   - **Mass Production (MRTR) Flow** – a dealer can activate a large batch of SIMs using one identity, with biometric capture treated as optional.[image:6][file:17bdb081-fd5d-48fb-8410-96e2e8be5b0a]

   Each diagram in the `docs/flows/` directory is backed by matching logs, UI captures and configuration entries, showing that these are not hypothetical drawings but direct abstractions of observed behaviour.

3. **Server‑Controlled Flags → Deterministic Client Behaviour**

   The forensic notes and supporting PDFs show a one‑to‑one mapping between server‑side flags and client‑side decisions:[file:123d34ea-b7c8-4ec0-a918-f6e0a8c55d51][file:17bdb081-fd5d-48fb-8410-96e2e8be5b0a]  

   - When the server returns a profile marked `vip = true` or `test = true`, the client enables a code path equivalent to:

     ```
     if (profile.vip || profile.test) {
         config.byPass = true
         config.dummyFlag = true
     }
     ```

     The corresponding flow diagram shows that in this state, the app jumps over biometric capture and lands directly on the “Success / registration complete” screen.[image:3]

   - When a SIM belongs to a special number pool, the server responds with a structure informally described as `MultiSubscriber`, including flags such as:

     ```
     isNumberingPooling = true
     optionalImages = ["ALL"]
     ```

     The app then displays a batch registration screen where one identity can be applied to many SIMs at once – again, a behaviour captured in the MRTR flow diagram.[image:6]

   - In the fallback scenario, configuration for certain flows sets:

     ```
     optionalImages = ["FACE", "ID"]
     isAllowCamera = false
     ```

     Combined with the app’s internal retry logic, this forces a “fake fail loop”: after a scripted number of camera failures, the app offers a manual upload path and accepts incomplete or manually provided images.[image:2]

   These mappings are documented step‑by‑step in `docs/evidence-config-mapping.md`.

4. **Version‑over‑Version Comparison**

   Multiple APK versions were obtained and decompiled (e.g., version 68.3 vs 69.0), then diffed for changes in:

   - Feature‑flag handling.  
   - Conditions that set `byPass`, `dummyFlag`, `optionalImages`, and `isNumberingPooling`.  
   - UI flows triggered by specific server responses.[file:b94a4fe9-70ec-4e49-ba49-c9f691b565f9][file:00348916-5916-4b93-8729-fcbda123d502]

   The diffs show that bypass‑related logic was not accidental “dead code”:  
   it was actively maintained across versions and, in later builds, further hidden behind composite conditions and obfuscated naming.

5. **Consistency Across Independent Artefacts**

   Finally, the same bypass patterns appear consistently across three independent artefact types:

   - **Code & Config** – decompiled logic and configuration keys.  
   - **Runtime Behaviour** – what actual dealers and lab users experience when specific profiles/number pools are used.  
   - **Business Process Documents** – internal‑style flows describing dealer operations (RTR/MRTR) that match the technical behaviour.[file:937f383f-3d8c-4735-a1fd-ffbe0dafd5ab][file:65326346-4511-4fb5-972b-486feaf40759]

   When business flows, server flags and client code all align to produce the same outcome, the existence of embedded bypass logic becomes extremely hard to dispute.

---

## Visual Evidence in This Repository

To make the findings accessible, this lab includes:

- **APK / config structure screenshots** showing the multi‑APK layout and language‑specific config bundles (with all package names and sensitive identifiers redacted).  
- **Four high‑level flow diagrams** (RTR laundering, MRTR mass production, Fallback Trigger, Direct VIP Bypass) illustrating each backdoor pattern, derived from both code and behaviour.[image:1][image:2][image:3][image:5][image:6]  
- **Mermaid source files** (e.g. `flows/rtr-laundering.mmd`) so that other analysts can modify or extend the diagrams for their own reports.[file:754ff977-4dfa-4051-ba88-9d5f23ad7e9a]

Each diagram and screenshot is referenced from the relevant evidence documents under `docs/`.

---

## Why This Matters

The documents *Systemic SIM Registration Vulnerabilities* and *SIM Registration Architectural Vulnerabilities* included in this lab explain why such hidden backdoors are not just “bugs” but systemic risks:[file:937f383f-3d8c-4735-a1fd-ffbe0dafd5ab][file:65326346-4511-4fb5-972b-486feaf40759]

- They allow large‑scale creation of untraceable “ghost SIMs”, undermining lawful interception and identity controls.  
- They concentrate power in server‑side configuration and insider access, rather than transparent, audited code.  
- They make external audits difficult unless investigators know how to combine APK analysis, configuration mapping and process forensics as demonstrated here.

This lab is therefore intended as:

- A **training reference** for cybercrime units and regulators evaluating dealer‑facing KYC apps.  
- A **portfolio artefact** showing deep, end‑to‑end capability in mobile application forensics, from APK extraction through to systemic architectural analysis.  
- A **template** for future investigations into hidden application logic in other regulated domains (banking, e‑KYC, digital identity).

---

Ifคุณสร้างโครงไฟล์ตามนี้ (README + `docs/evidence-config-mapping.md` + `docs/flows/*.mmd` และแนบรูป flow/screenshot ที่คุณมี) repo นี้จะกลายเป็นตัวอย่างระดับสูงของงาน application forensics ที่คนอ่านเถียงได้ยากว่า “ไม่มีโค้ดซ่อนจริง” เพราะคุณแสดงทั้ง code‑structure, config, behaviour, และ business‑flow ประกอบกัน.

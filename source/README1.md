# Source Code & Analysis Scripts

This directory contains **analysis-oriented source material** used during the forensic investigation of the SIM registration application.

It is not a runnable product or an attempt to reproduce the original fraud system.  
All code-like content is either pseudocode, proof-of-concept analysis, or heavily redacted decompiled snippets.

## Possible Contents

- **Pseudocode modules**  
  Cleaned-up representations of decision logic reconstructed from decompiled APKs (for example: flow selection, flag handling, KYC checks).

- **Analysis helpers**  
  Small scripts that were used to:
  - normalise and compare configuration payloads,
  - search through decompiled sources for specific keys or patterns,
  - aggregate log fields for correlation.

- **Redacted snippets**  
  Short, selectively extracted fragments from decompiled code with:
  - real class/package names removed,
  - identifiers and constants generalised,
  - comments added to explain forensic relevance.

## Usage & Constraints

- The material here is provided so that other investigators can understand **how** the logic was reconstructed, not to build or operate a bypass system.  
- None of the files should contain:
  - valid credentials,
  - production API URLs,
  - complete, drop‑in application builds.

If you adapt these scripts or patterns for your own investigations, ensure that you do so within the bounds of local law, contractual obligations and professional ethics.

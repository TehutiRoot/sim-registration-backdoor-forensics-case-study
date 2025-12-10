package com.google.auth.oauth2;

import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public interface IdTokenProvider {

    /* loaded from: classes4.dex */
    public enum Option {
        FORMAT_FULL("formatFull"),
        LICENSES_TRUE("licensesTrue"),
        INCLUDE_EMAIL("includeEmail");
        
        private final String option;

        Option(String str) {
            this.option = str;
        }

        public String getOption() {
            return this.option;
        }
    }

    IdToken idTokenWithAudience(String str, List<Option> list) throws IOException;
}

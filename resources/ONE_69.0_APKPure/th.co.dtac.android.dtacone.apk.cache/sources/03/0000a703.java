package com.google.auth.oauth2;

import com.google.auth.oauth2.ExternalAccountCredentials;
import java.math.BigDecimal;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class PluggableAuthCredentialSource extends ExternalAccountCredentials.CredentialSource {
    static final String COMMAND_KEY = "command";
    static final int DEFAULT_EXECUTABLE_TIMEOUT_MS = 30000;
    static final int MAXIMUM_EXECUTABLE_TIMEOUT_MS = 120000;
    static final int MINIMUM_EXECUTABLE_TIMEOUT_MS = 5000;
    static final String OUTPUT_FILE_KEY = "output_file";
    static final String TIMEOUT_MILLIS_KEY = "timeout_millis";
    final String executableCommand;
    final int executableTimeoutMs;
    @Nullable
    final String outputFilePath;

    public PluggableAuthCredentialSource(Map<String, Object> map) {
        super(map);
        if (map.containsKey("executable")) {
            Map map2 = (Map) map.get("executable");
            if (map2.containsKey(COMMAND_KEY)) {
                if (map2.containsKey(TIMEOUT_MILLIS_KEY)) {
                    Object obj = map2.get(TIMEOUT_MILLIS_KEY);
                    if (obj instanceof BigDecimal) {
                        this.executableTimeoutMs = ((BigDecimal) obj).intValue();
                    } else if (map2.get(TIMEOUT_MILLIS_KEY) instanceof Integer) {
                        this.executableTimeoutMs = ((Integer) obj).intValue();
                    } else {
                        this.executableTimeoutMs = Integer.parseInt((String) obj);
                    }
                } else {
                    this.executableTimeoutMs = 30000;
                }
                int i = this.executableTimeoutMs;
                if (i >= 5000 && i <= MAXIMUM_EXECUTABLE_TIMEOUT_MS) {
                    this.executableCommand = (String) map2.get(COMMAND_KEY);
                    this.outputFilePath = (String) map2.get(OUTPUT_FILE_KEY);
                    return;
                }
                throw new IllegalArgumentException(String.format("The executable timeout must be between %s and %s milliseconds.", 5000, Integer.valueOf((int) MAXIMUM_EXECUTABLE_TIMEOUT_MS)));
            }
            throw new IllegalArgumentException("The PluggableAuthCredentialSource is missing the required 'command' field.");
        }
        throw new IllegalArgumentException("Invalid credential source for PluggableAuth credentials.");
    }

    public String getCommand() {
        return this.executableCommand;
    }

    @Nullable
    public String getOutputFilePath() {
        return this.outputFilePath;
    }

    public int getTimeoutMs() {
        return this.executableTimeoutMs;
    }
}
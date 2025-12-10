package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.auth.oauth2.C7377f;
import com.google.auth.oauth2.ExecutableHandler;
import com.google.common.base.Splitter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.auth.oauth2.f */
/* loaded from: classes4.dex */
public final class C7377f implements ExecutableHandler {

    /* renamed from: a */
    public final InterfaceC0599IS f52673a;

    /* renamed from: b */
    public AbstractC7379b f52674b;

    /* renamed from: com.google.auth.oauth2.f$a */
    /* loaded from: classes4.dex */
    public static final class C7378a extends AbstractC7379b {

        /* renamed from: a */
        public ProcessBuilder f52675a;

        public C7378a(ProcessBuilder processBuilder) {
            this.f52675a = processBuilder;
        }

        @Override // com.google.auth.oauth2.C7377f.AbstractC7379b
        /* renamed from: a */
        public Map mo41479a() {
            return this.f52675a.environment();
        }

        @Override // com.google.auth.oauth2.C7377f.AbstractC7379b
        /* renamed from: b */
        public AbstractC7379b mo41478b(boolean z) {
            this.f52675a.redirectErrorStream(z);
            return this;
        }

        @Override // com.google.auth.oauth2.C7377f.AbstractC7379b
        /* renamed from: c */
        public Process mo41477c() {
            return this.f52675a.start();
        }
    }

    /* renamed from: com.google.auth.oauth2.f$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7379b {
        /* renamed from: a */
        public abstract Map mo41479a();

        /* renamed from: b */
        public abstract AbstractC7379b mo41478b(boolean z);

        /* renamed from: c */
        public abstract Process mo41477c();
    }

    public C7377f(InterfaceC0599IS interfaceC0599IS) {
        this.f52673a = interfaceC0599IS;
    }

    /* renamed from: b */
    public static /* synthetic */ String m41484b(Process process) {
        return m41480f(process);
    }

    /* renamed from: f */
    public static /* synthetic */ String m41480f(Process process) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(System.lineSeparator());
            } else {
                return sb.toString().trim();
            }
        }
    }

    @Override // com.google.auth.oauth2.ExecutableHandler
    /* renamed from: a */
    public String mo41485a(ExecutableHandler.ExecutableOptions executableOptions) {
        if ("1".equals(this.f52673a.getEnv("GOOGLE_EXTERNAL_ACCOUNT_ALLOW_EXECUTABLES"))) {
            C7375d m41483c = m41483c(executableOptions);
            if (m41483c == null) {
                m41483c = m41482d(executableOptions);
            }
            if (executableOptions.getOutputFilePath() != null && !executableOptions.getOutputFilePath().isEmpty() && m41483c.m41494g() && m41483c.m41498c() == null) {
                throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response must contain the `expiration_time` field for successful responses when an output_file has been specified in the configuration.");
            }
            if (m41483c.m41496e() <= 1) {
                if (m41483c.m41494g()) {
                    if (!m41483c.m41495f()) {
                        return m41483c.m41497d();
                    }
                    throw new PluggableAuthException("INVALID_RESPONSE", "The executable response is expired.");
                }
                throw new PluggableAuthException(m41483c.m41500a(), m41483c.m41499b());
            }
            throw new PluggableAuthException("UNSUPPORTED_VERSION", "The version of the executable response is not supported. " + String.format("The maximum version currently supported is %s.", 1));
        }
        throw new PluggableAuthException("PLUGGABLE_AUTH_DISABLED", "Pluggable Auth executables need to be explicitly allowed to run by setting the GOOGLE_EXTERNAL_ACCOUNT_ALLOW_EXECUTABLES environment variable to 1.");
    }

    /* renamed from: c */
    public C7375d m41483c(ExecutableHandler.ExecutableOptions executableOptions) {
        if (executableOptions.getOutputFilePath() == null || executableOptions.getOutputFilePath().isEmpty()) {
            return null;
        }
        try {
            File file = new File(executableOptions.getOutputFilePath());
            if (!file.isFile() || file.length() <= 0) {
                return null;
            }
            C7375d c7375d = new C7375d((GenericJson) CJ0.f695f.createJsonParser(new BufferedReader(new InputStreamReader(new FileInputStream(executableOptions.getOutputFilePath()), StandardCharsets.UTF_8))).parseAndClose((Class<Object>) GenericJson.class));
            if (!c7375d.m41493h()) {
                return null;
            }
            return c7375d;
        } catch (Exception e) {
            throw new PluggableAuthException("INVALID_OUTPUT_FILE", "The output_file specified contains an invalid or malformed response." + e);
        }
    }

    /* renamed from: d */
    public C7375d m41482d(ExecutableHandler.ExecutableOptions executableOptions) {
        IOException e;
        String str;
        boolean waitFor;
        AbstractC7379b m41481e = m41481e(Splitter.m41289on(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).splitToList(executableOptions.getExecutableCommand()));
        m41481e.mo41479a().putAll(executableOptions.getEnvironmentMap());
        m41481e.mo41478b(true);
        final Process mo41477c = m41481e.mo41477c();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                Future submit = newSingleThreadExecutor.submit(new Callable() { // from class: Lk1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C7377f.m41484b(mo41477c);
                    }
                });
                waitFor = mo41477c.waitFor(executableOptions.getExecutableTimeoutMs(), TimeUnit.MILLISECONDS);
                if (waitFor) {
                    int exitValue = mo41477c.exitValue();
                    if (exitValue == 0) {
                        str = (String) submit.get();
                        try {
                            newSingleThreadExecutor.shutdownNow();
                            C7375d c7375d = new C7375d((GenericJson) CJ0.f695f.createJsonParser(str).parseAndClose((Class<Object>) GenericJson.class));
                            mo41477c.destroy();
                            return c7375d;
                        } catch (IOException e2) {
                            e = e2;
                            mo41477c.destroy();
                            if (!newSingleThreadExecutor.isShutdown()) {
                                newSingleThreadExecutor.shutdownNow();
                            }
                            if (e instanceof PluggableAuthException) {
                                throw e;
                            }
                            throw new PluggableAuthException("INVALID_RESPONSE", String.format("The executable returned an invalid response: %s.", str));
                        }
                    }
                    throw new PluggableAuthException("EXIT_CODE", String.format("The executable failed with exit code %s.", Integer.valueOf(exitValue)));
                }
                throw new PluggableAuthException("TIMEOUT_EXCEEDED", "The executable failed to finish within the timeout specified.");
            } catch (InterruptedException | ExecutionException e3) {
                mo41477c.destroy();
                throw new PluggableAuthException("INTERRUPTED", String.format("The execution was interrupted: %s.", e3));
            }
        } catch (IOException e4) {
            e = e4;
            str = "";
        }
    }

    /* renamed from: e */
    public AbstractC7379b m41481e(List list) {
        AbstractC7379b abstractC7379b = this.f52674b;
        if (abstractC7379b != null) {
            return abstractC7379b;
        }
        return new C7378a(new ProcessBuilder(list));
    }
}

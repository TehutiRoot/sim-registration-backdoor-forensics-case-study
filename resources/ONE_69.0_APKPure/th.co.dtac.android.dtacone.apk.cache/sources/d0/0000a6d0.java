package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.auth.oauth2.IdentityPoolCredentialSource;
import com.google.common.p014io.CharStreams;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/* loaded from: classes4.dex */
class FileIdentityPoolSubjectTokenSupplier implements IdentityPoolSubjectTokenSupplier {
    private final IdentityPoolCredentialSource credentialSource;
    private final long serialVersionUID = 2475549052347431992L;

    public FileIdentityPoolSubjectTokenSupplier(IdentityPoolCredentialSource identityPoolCredentialSource) {
        this.credentialSource = identityPoolCredentialSource;
    }

    public static String parseToken(InputStream inputStream, IdentityPoolCredentialSource identityPoolCredentialSource) throws IOException {
        if (identityPoolCredentialSource.credentialFormatType == IdentityPoolCredentialSource.CredentialFormatType.TEXT) {
            return CharStreams.toString(new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)));
        }
        GenericJson genericJson = (GenericJson) new JsonObjectParser(IJ0.f2657f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class);
        if (genericJson.containsKey(identityPoolCredentialSource.subjectTokenFieldName)) {
            return (String) genericJson.get(identityPoolCredentialSource.subjectTokenFieldName);
        }
        throw new IOException("Invalid subject token field name. No subject token was found.");
    }

    @Override // com.google.auth.oauth2.IdentityPoolSubjectTokenSupplier
    public String getSubjectToken(ExternalAccountSupplierContext externalAccountSupplierContext) throws IOException {
        Path path;
        LinkOption linkOption;
        boolean exists;
        String str = this.credentialSource.credentialLocation;
        path = Paths.get(str, new String[0]);
        linkOption = LinkOption.NOFOLLOW_LINKS;
        exists = Files.exists(path, linkOption);
        if (exists) {
            try {
                return parseToken(new FileInputStream(new File(str)), this.credentialSource);
            } catch (IOException e) {
                throw new IOException("Error when attempting to read the subject token from the credential file.", e);
            }
        }
        throw new IOException(String.format("Invalid credential location. The file at %s does not exist.", str));
    }
}
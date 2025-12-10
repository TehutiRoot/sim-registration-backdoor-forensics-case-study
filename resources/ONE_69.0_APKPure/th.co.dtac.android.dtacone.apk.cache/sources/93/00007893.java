package p000;

import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.HttpIOExceptionHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19299bs0 implements HttpUnsuccessfulResponseHandler, HttpIOExceptionHandler {

    /* renamed from: d */
    public static final Logger f39240d = Logger.getLogger(C19299bs0.class.getName());

    /* renamed from: a */
    public final MediaHttpUploader f39241a;

    /* renamed from: b */
    public final HttpIOExceptionHandler f39242b;

    /* renamed from: c */
    public final HttpUnsuccessfulResponseHandler f39243c;

    public C19299bs0(MediaHttpUploader mediaHttpUploader, HttpRequest httpRequest) {
        this.f39241a = (MediaHttpUploader) Preconditions.checkNotNull(mediaHttpUploader);
        this.f39242b = httpRequest.getIOExceptionHandler();
        this.f39243c = httpRequest.getUnsuccessfulResponseHandler();
        httpRequest.setIOExceptionHandler(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z) {
        boolean z2;
        HttpIOExceptionHandler httpIOExceptionHandler = this.f39242b;
        if (httpIOExceptionHandler != null && httpIOExceptionHandler.handleIOException(httpRequest, z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                this.f39241a.m41777j();
            } catch (IOException e) {
                f39240d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e);
            }
        }
        return z2;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2;
        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.f39243c;
        if (httpUnsuccessfulResponseHandler != null && httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && httpResponse.getStatusCode() / 100 == 5) {
            try {
                this.f39241a.m41777j();
            } catch (IOException e) {
                f39240d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e);
            }
        }
        return z2;
    }
}
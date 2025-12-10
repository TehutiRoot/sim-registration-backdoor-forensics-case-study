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

/* renamed from: Vr0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18651Vr0 implements HttpUnsuccessfulResponseHandler, HttpIOExceptionHandler {

    /* renamed from: d */
    public static final Logger f6833d = Logger.getLogger(C18651Vr0.class.getName());

    /* renamed from: a */
    public final MediaHttpUploader f6834a;

    /* renamed from: b */
    public final HttpIOExceptionHandler f6835b;

    /* renamed from: c */
    public final HttpUnsuccessfulResponseHandler f6836c;

    public C18651Vr0(MediaHttpUploader mediaHttpUploader, HttpRequest httpRequest) {
        this.f6834a = (MediaHttpUploader) Preconditions.checkNotNull(mediaHttpUploader);
        this.f6835b = httpRequest.getIOExceptionHandler();
        this.f6836c = httpRequest.getUnsuccessfulResponseHandler();
        httpRequest.setIOExceptionHandler(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z) {
        boolean z2;
        HttpIOExceptionHandler httpIOExceptionHandler = this.f6835b;
        if (httpIOExceptionHandler != null && httpIOExceptionHandler.handleIOException(httpRequest, z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                this.f6834a.m41790j();
            } catch (IOException e) {
                f6833d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e);
            }
        }
        return z2;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2;
        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.f6836c;
        if (httpUnsuccessfulResponseHandler != null && httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && httpResponse.getStatusCode() / 100 == 5) {
            try {
                this.f6834a.m41790j();
            } catch (IOException e) {
                f6833d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e);
            }
        }
        return z2;
    }
}

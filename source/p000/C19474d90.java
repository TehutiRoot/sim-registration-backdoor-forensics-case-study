package p000;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: d90  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19474d90 extends AbstractHttpContent {

    /* renamed from: c */
    public final HttpRequest f61085c;

    public C19474d90(HttpRequest httpRequest) {
        super("application/http");
        this.f61085c = httpRequest;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, getCharset());
        outputStreamWriter.write(this.f61085c.getRequestMethod());
        outputStreamWriter.write(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        outputStreamWriter.write(this.f61085c.getUrl().build());
        outputStreamWriter.write(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        outputStreamWriter.write("HTTP/1.1");
        outputStreamWriter.write("\r\n");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.fromHttpHeaders(this.f61085c.getHeaders());
        httpHeaders.setAcceptEncoding(null).setUserAgent(null).setContentEncoding(null).setContentType(null).setContentLength(null);
        HttpContent content = this.f61085c.getContent();
        if (content != null) {
            httpHeaders.setContentType(content.getType());
            long length = content.getLength();
            if (length != -1) {
                httpHeaders.setContentLength(Long.valueOf(length));
            }
        }
        HttpHeaders.serializeHeadersForMultipartRequests(httpHeaders, null, null, outputStreamWriter);
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
        if (content != null) {
            content.writeTo(outputStream);
        }
    }
}

package com.google.common.net;

import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.net.MediaType;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;
import org.apache.http.message.TokenParser;
import org.bouncycastle.i18n.TextBundle;
import org.slf4j.Marker;

@Immutable
@GwtCompatible
/* loaded from: classes4.dex */
public final class MediaType {

    /* renamed from: a */
    public final String f54067a;

    /* renamed from: b */
    public final String f54068b;

    /* renamed from: c */
    public final ImmutableListMultimap f54069c;

    /* renamed from: d */
    public String f54070d;

    /* renamed from: e */
    public int f54071e;

    /* renamed from: f */
    public Optional f54072f;

    /* renamed from: g */
    public static final ImmutableListMultimap f54061g = ImmutableListMultimap.m40971of("charset", Ascii.toLowerCase(StandardCharsets.UTF_8.name()));

    /* renamed from: h */
    public static final CharMatcher f54062h = CharMatcher.ascii().and(CharMatcher.javaIsoControl().negate()).and(CharMatcher.isNot(TokenParser.f74644SP)).and(CharMatcher.noneOf("()<>@,;:\\\"/[]?="));

    /* renamed from: i */
    public static final CharMatcher f54063i = CharMatcher.ascii().and(CharMatcher.noneOf("\"\\\r"));

    /* renamed from: j */
    public static final CharMatcher f54064j = CharMatcher.anyOf(" \t\r\n");

    /* renamed from: k */
    public static final Map f54065k = Maps.newHashMap();
    public static final MediaType ANY_TYPE = m39884f(Marker.ANY_MARKER, Marker.ANY_MARKER);
    public static final MediaType ANY_TEXT_TYPE = m39884f(TextBundle.TEXT_ENTRY, Marker.ANY_MARKER);
    public static final MediaType ANY_IMAGE_TYPE = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, Marker.ANY_MARKER);
    public static final MediaType ANY_AUDIO_TYPE = m39884f("audio", Marker.ANY_MARKER);
    public static final MediaType ANY_VIDEO_TYPE = m39884f("video", Marker.ANY_MARKER);
    public static final MediaType ANY_APPLICATION_TYPE = m39884f("application", Marker.ANY_MARKER);
    public static final MediaType ANY_FONT_TYPE = m39884f("font", Marker.ANY_MARKER);
    public static final MediaType CACHE_MANIFEST_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "cache-manifest");
    public static final MediaType CSS_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "css");
    public static final MediaType CSV_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "csv");
    public static final MediaType HTML_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "html");
    public static final MediaType I_CALENDAR_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "calendar");
    public static final MediaType MD_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "markdown");
    public static final MediaType PLAIN_TEXT_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "plain");
    public static final MediaType TEXT_JAVASCRIPT_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "javascript");
    public static final MediaType TSV_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "tab-separated-values");
    public static final MediaType VCARD_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "vcard");
    public static final MediaType WML_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "vnd.wap.wml");
    public static final MediaType XML_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "xml");
    public static final MediaType VTT_UTF_8 = m39883g(TextBundle.TEXT_ENTRY, "vtt");
    public static final MediaType BMP = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "bmp");
    public static final MediaType CRW = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "x-canon-crw");
    public static final MediaType GIF = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "gif");
    public static final MediaType ICO = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "vnd.microsoft.icon");
    public static final MediaType JPEG = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "jpeg");
    public static final MediaType PNG = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "png");
    public static final MediaType PSD = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "vnd.adobe.photoshop");
    public static final MediaType SVG_UTF_8 = m39883g(ResponseProcessor.CONTENT_TYPE_IMAGE, "svg+xml");
    public static final MediaType TIFF = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "tiff");
    public static final MediaType WEBP = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "webp");
    public static final MediaType HEIF = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "heif");
    public static final MediaType JP2K = m39884f(ResponseProcessor.CONTENT_TYPE_IMAGE, "jp2");
    public static final MediaType MP4_AUDIO = m39884f("audio", "mp4");
    public static final MediaType MPEG_AUDIO = m39884f("audio", "mpeg");
    public static final MediaType OGG_AUDIO = m39884f("audio", "ogg");
    public static final MediaType WEBM_AUDIO = m39884f("audio", "webm");
    public static final MediaType L16_AUDIO = m39884f("audio", "l16");
    public static final MediaType L24_AUDIO = m39884f("audio", "l24");
    public static final MediaType BASIC_AUDIO = m39884f("audio", "basic");
    public static final MediaType AAC_AUDIO = m39884f("audio", "aac");
    public static final MediaType VORBIS_AUDIO = m39884f("audio", "vorbis");
    public static final MediaType WMA_AUDIO = m39884f("audio", "x-ms-wma");
    public static final MediaType WAX_AUDIO = m39884f("audio", "x-ms-wax");
    public static final MediaType VND_REAL_AUDIO = m39884f("audio", "vnd.rn-realaudio");
    public static final MediaType VND_WAVE_AUDIO = m39884f("audio", "vnd.wave");
    public static final MediaType MP4_VIDEO = m39884f("video", "mp4");
    public static final MediaType MPEG_VIDEO = m39884f("video", "mpeg");
    public static final MediaType OGG_VIDEO = m39884f("video", "ogg");
    public static final MediaType QUICKTIME = m39884f("video", "quicktime");
    public static final MediaType WEBM_VIDEO = m39884f("video", "webm");
    public static final MediaType WMV = m39884f("video", "x-ms-wmv");
    public static final MediaType FLV_VIDEO = m39884f("video", "x-flv");
    public static final MediaType THREE_GPP_VIDEO = m39884f("video", "3gpp");
    public static final MediaType THREE_GPP2_VIDEO = m39884f("video", "3gpp2");
    public static final MediaType APPLICATION_XML_UTF_8 = m39883g("application", "xml");
    public static final MediaType ATOM_UTF_8 = m39883g("application", "atom+xml");
    public static final MediaType BZIP2 = m39884f("application", "x-bzip2");
    public static final MediaType DART_UTF_8 = m39883g("application", "dart");
    public static final MediaType APPLE_PASSBOOK = m39884f("application", "vnd.apple.pkpass");
    public static final MediaType EOT = m39884f("application", "vnd.ms-fontobject");
    public static final MediaType EPUB = m39884f("application", "epub+zip");
    public static final MediaType FORM_DATA = m39884f("application", "x-www-form-urlencoded");
    public static final MediaType KEY_ARCHIVE = m39884f("application", "pkcs12");
    public static final MediaType APPLICATION_BINARY = m39884f("application", "binary");
    public static final MediaType GEO_JSON = m39884f("application", "geo+json");
    public static final MediaType GZIP = m39884f("application", "x-gzip");
    public static final MediaType HAL_JSON = m39884f("application", "hal+json");
    public static final MediaType JAVASCRIPT_UTF_8 = m39883g("application", "javascript");
    public static final MediaType JOSE = m39884f("application", "jose");
    public static final MediaType JOSE_JSON = m39884f("application", "jose+json");
    public static final MediaType JSON_UTF_8 = m39883g("application", "json");
    public static final MediaType JWT = m39884f("application", "jwt");
    public static final MediaType MANIFEST_JSON_UTF_8 = m39883g("application", "manifest+json");
    public static final MediaType KML = m39884f("application", "vnd.google-earth.kml+xml");
    public static final MediaType KMZ = m39884f("application", "vnd.google-earth.kmz");
    public static final MediaType MBOX = m39884f("application", "mbox");
    public static final MediaType APPLE_MOBILE_CONFIG = m39884f("application", "x-apple-aspen-config");
    public static final MediaType MICROSOFT_EXCEL = m39884f("application", "vnd.ms-excel");
    public static final MediaType MICROSOFT_OUTLOOK = m39884f("application", "vnd.ms-outlook");
    public static final MediaType MICROSOFT_POWERPOINT = m39884f("application", "vnd.ms-powerpoint");
    public static final MediaType MICROSOFT_WORD = m39884f("application", "msword");
    public static final MediaType MEDIA_PRESENTATION_DESCRIPTION = m39884f("application", "dash+xml");
    public static final MediaType WASM_APPLICATION = m39884f("application", "wasm");
    public static final MediaType NACL_APPLICATION = m39884f("application", "x-nacl");
    public static final MediaType NACL_PORTABLE_APPLICATION = m39884f("application", "x-pnacl");
    public static final MediaType OCTET_STREAM = m39884f("application", "octet-stream");
    public static final MediaType OGG_CONTAINER = m39884f("application", "ogg");
    public static final MediaType OOXML_DOCUMENT = m39884f("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final MediaType OOXML_PRESENTATION = m39884f("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final MediaType OOXML_SHEET = m39884f("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final MediaType OPENDOCUMENT_GRAPHICS = m39884f("application", "vnd.oasis.opendocument.graphics");
    public static final MediaType OPENDOCUMENT_PRESENTATION = m39884f("application", "vnd.oasis.opendocument.presentation");
    public static final MediaType OPENDOCUMENT_SPREADSHEET = m39884f("application", "vnd.oasis.opendocument.spreadsheet");
    public static final MediaType OPENDOCUMENT_TEXT = m39884f("application", "vnd.oasis.opendocument.text");
    public static final MediaType OPENSEARCH_DESCRIPTION_UTF_8 = m39883g("application", "opensearchdescription+xml");
    public static final MediaType PDF = m39884f("application", "pdf");
    public static final MediaType POSTSCRIPT = m39884f("application", "postscript");
    public static final MediaType PROTOBUF = m39884f("application", "protobuf");
    public static final MediaType RDF_XML_UTF_8 = m39883g("application", "rdf+xml");
    public static final MediaType RTF_UTF_8 = m39883g("application", "rtf");
    public static final MediaType SFNT = m39884f("application", "font-sfnt");
    public static final MediaType SHOCKWAVE_FLASH = m39884f("application", "x-shockwave-flash");
    public static final MediaType SKETCHUP = m39884f("application", "vnd.sketchup.skp");
    public static final MediaType SOAP_XML_UTF_8 = m39883g("application", "soap+xml");
    public static final MediaType TAR = m39884f("application", "x-tar");
    public static final MediaType WOFF = m39884f("application", "font-woff");
    public static final MediaType WOFF2 = m39884f("application", "font-woff2");
    public static final MediaType XHTML_UTF_8 = m39883g("application", "xhtml+xml");
    public static final MediaType XRD_UTF_8 = m39883g("application", "xrd+xml");
    public static final MediaType ZIP = m39884f("application", "zip");
    public static final MediaType FONT_COLLECTION = m39884f("font", "collection");
    public static final MediaType FONT_OTF = m39884f("font", "otf");
    public static final MediaType FONT_SFNT = m39884f("font", "sfnt");
    public static final MediaType FONT_TTF = m39884f("font", "ttf");
    public static final MediaType FONT_WOFF = m39884f("font", "woff");
    public static final MediaType FONT_WOFF2 = m39884f("font", "woff2");

    /* renamed from: l */
    public static final Joiner.MapJoiner f54066l = Joiner.m41309on("; ").withKeyValueSeparator("=");

    /* renamed from: com.google.common.net.MediaType$a */
    /* loaded from: classes4.dex */
    public static final class C8118a {

        /* renamed from: a */
        public final String f54073a;

        /* renamed from: b */
        public int f54074b = 0;

        public C8118a(String str) {
            this.f54073a = str;
        }

        /* renamed from: a */
        public char m39876a(char c) {
            boolean z;
            Preconditions.checkState(m39872e());
            if (m39871f() == c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f54074b++;
            return c;
        }

        /* renamed from: b */
        public char m39875b(CharMatcher charMatcher) {
            Preconditions.checkState(m39872e());
            char m39871f = m39871f();
            Preconditions.checkState(charMatcher.matches(m39871f));
            this.f54074b++;
            return m39871f;
        }

        /* renamed from: c */
        public String m39874c(CharMatcher charMatcher) {
            boolean z;
            int i = this.f54074b;
            String m39873d = m39873d(charMatcher);
            if (this.f54074b != i) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            return m39873d;
        }

        /* renamed from: d */
        public String m39873d(CharMatcher charMatcher) {
            Preconditions.checkState(m39872e());
            int i = this.f54074b;
            this.f54074b = charMatcher.negate().indexIn(this.f54073a, i);
            if (m39872e()) {
                return this.f54073a.substring(i, this.f54074b);
            }
            return this.f54073a.substring(i);
        }

        /* renamed from: e */
        public boolean m39872e() {
            int i = this.f54074b;
            if (i >= 0 && i < this.f54073a.length()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public char m39871f() {
            Preconditions.checkState(m39872e());
            return this.f54073a.charAt(this.f54074b);
        }
    }

    public MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f54067a = str;
        this.f54068b = str2;
        this.f54069c = immutableListMultimap;
    }

    /* renamed from: a */
    public static /* synthetic */ String m39889a(String str) {
        return m39881i(str);
    }

    /* renamed from: b */
    public static MediaType m39888b(MediaType mediaType) {
        f54065k.put(mediaType, mediaType);
        return mediaType;
    }

    public static MediaType create(String str, String str2) {
        MediaType m39885e = m39885e(str, str2, ImmutableListMultimap.m40972of());
        m39885e.f54072f = Optional.absent();
        return m39885e;
    }

    /* renamed from: d */
    public static void m39886d(C8118a c8118a, char c) {
        CharMatcher charMatcher = f54064j;
        c8118a.m39873d(charMatcher);
        c8118a.m39876a(c);
        c8118a.m39873d(charMatcher);
    }

    /* renamed from: e */
    public static MediaType m39885e(String str, String str2, Multimap multimap) {
        boolean z;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(multimap);
        String m39878k = m39878k(str);
        String m39878k2 = m39878k(str2);
        if (Marker.ANY_MARKER.equals(m39878k) && !Marker.ANY_MARKER.equals(m39878k2)) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "A wildcard type cannot be used with a non-wildcard subtype");
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        for (Map.Entry entry : multimap.entries()) {
            String m39878k3 = m39878k((String) entry.getKey());
            builder.put((ImmutableListMultimap.Builder) m39878k3, m39879j(m39878k3, (String) entry.getValue()));
        }
        MediaType mediaType = new MediaType(m39878k, m39878k2, builder.build());
        return (MediaType) MoreObjects.firstNonNull((MediaType) f54065k.get(mediaType), mediaType);
    }

    /* renamed from: f */
    public static MediaType m39884f(String str, String str2) {
        MediaType m39888b = m39888b(new MediaType(str, str2, ImmutableListMultimap.m40972of()));
        m39888b.f54072f = Optional.absent();
        return m39888b;
    }

    /* renamed from: g */
    public static MediaType m39883g(String str, String str2) {
        MediaType m39888b = m39888b(new MediaType(str, str2, f54061g));
        m39888b.f54072f = Optional.m41300of(StandardCharsets.UTF_8);
        return m39888b;
    }

    /* renamed from: h */
    public static String m39882h(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    /* renamed from: i */
    public static /* synthetic */ String m39881i(String str) {
        if (!f54062h.matchesAllOf(str) || str.isEmpty()) {
            return m39882h(str);
        }
        return str;
    }

    /* renamed from: j */
    public static String m39879j(String str, String str2) {
        Preconditions.checkNotNull(str2);
        Preconditions.checkArgument(CharMatcher.ascii().matchesAllOf(str2), "parameter values must be ASCII: %s", str2);
        if ("charset".equals(str)) {
            return Ascii.toLowerCase(str2);
        }
        return str2;
    }

    /* renamed from: k */
    public static String m39878k(String str) {
        Preconditions.checkArgument(f54062h.matchesAllOf(str));
        Preconditions.checkArgument(!str.isEmpty());
        return Ascii.toLowerCase(str);
    }

    @CanIgnoreReturnValue
    public static MediaType parse(String str) {
        String m39874c;
        Preconditions.checkNotNull(str);
        C8118a c8118a = new C8118a(str);
        try {
            CharMatcher charMatcher = f54062h;
            String m39874c2 = c8118a.m39874c(charMatcher);
            m39886d(c8118a, '/');
            String m39874c3 = c8118a.m39874c(charMatcher);
            ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
            while (c8118a.m39872e()) {
                m39886d(c8118a, ';');
                CharMatcher charMatcher2 = f54062h;
                String m39874c4 = c8118a.m39874c(charMatcher2);
                m39886d(c8118a, '=');
                if ('\"' == c8118a.m39871f()) {
                    c8118a.m39876a('\"');
                    StringBuilder sb = new StringBuilder();
                    while ('\"' != c8118a.m39871f()) {
                        if ('\\' == c8118a.m39871f()) {
                            c8118a.m39876a('\\');
                            sb.append(c8118a.m39875b(CharMatcher.ascii()));
                        } else {
                            sb.append(c8118a.m39874c(f54063i));
                        }
                    }
                    m39874c = sb.toString();
                    c8118a.m39876a('\"');
                } else {
                    m39874c = c8118a.m39874c(charMatcher2);
                }
                builder.put((ImmutableListMultimap.Builder) m39874c4, m39874c);
            }
            return m39885e(m39874c2, m39874c3, builder.build());
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("Could not parse '" + str + OperatorName.SHOW_TEXT_LINE, e);
        }
    }

    /* renamed from: c */
    public final String m39887c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54067a);
        sb.append('/');
        sb.append(this.f54068b);
        if (!this.f54069c.isEmpty()) {
            sb.append("; ");
            f54066l.appendTo(sb, Multimaps.transformValues((ListMultimap) this.f54069c, new Function() { // from class: Zr0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return MediaType.m39889a((String) obj);
                }
            }).entries());
        }
        return sb.toString();
    }

    public Optional<Charset> charset() {
        Optional<Charset> optional = this.f54072f;
        if (optional == null) {
            optional = Optional.absent();
            UnmodifiableIterator it = this.f54069c.get((ImmutableListMultimap) "charset").iterator();
            String str = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str == null) {
                    optional = Optional.m41300of(Charset.forName(str2));
                    str = str2;
                } else if (!str.equals(str2)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + str2);
                }
            }
            this.f54072f = optional;
        }
        return optional;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        if (this.f54067a.equals(mediaType.f54067a) && this.f54068b.equals(mediaType.f54068b) && m39877l().equals(mediaType.m39877l())) {
            return true;
        }
        return false;
    }

    public boolean hasWildcard() {
        if (!Marker.ANY_MARKER.equals(this.f54067a) && !Marker.ANY_MARKER.equals(this.f54068b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f54071e;
        if (i == 0) {
            int hashCode = Objects.hashCode(this.f54067a, this.f54068b, m39877l());
            this.f54071e = hashCode;
            return hashCode;
        }
        return i;
    }

    /* renamed from: is */
    public boolean m39880is(MediaType mediaType) {
        if ((mediaType.f54067a.equals(Marker.ANY_MARKER) || mediaType.f54067a.equals(this.f54067a)) && ((mediaType.f54068b.equals(Marker.ANY_MARKER) || mediaType.f54068b.equals(this.f54068b)) && this.f54069c.entries().containsAll(mediaType.f54069c.entries()))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final Map m39877l() {
        return Maps.transformValues(this.f54069c.asMap(), new Function() { // from class: as0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyOf((Collection) obj);
            }
        });
    }

    public ImmutableListMultimap<String, String> parameters() {
        return this.f54069c;
    }

    public String subtype() {
        return this.f54068b;
    }

    public String toString() {
        String str = this.f54070d;
        if (str == null) {
            String m39887c = m39887c();
            this.f54070d = m39887c;
            return m39887c;
        }
        return str;
    }

    public String type() {
        return this.f54067a;
    }

    public MediaType withCharset(Charset charset) {
        Preconditions.checkNotNull(charset);
        MediaType withParameter = withParameter("charset", charset.name());
        withParameter.f54072f = Optional.m41300of(charset);
        return withParameter;
    }

    public MediaType withParameter(String str, String str2) {
        return withParameters(str, ImmutableSet.m40919of(str2));
    }

    public MediaType withParameters(Multimap<String, String> multimap) {
        return m39885e(this.f54067a, this.f54068b, multimap);
    }

    public MediaType withoutParameters() {
        if (this.f54069c.isEmpty()) {
            return this;
        }
        return create(this.f54067a, this.f54068b);
    }

    public MediaType withParameters(String str, Iterable<String> iterable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(iterable);
        String m39878k = m39878k(str);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        UnmodifiableIterator it = this.f54069c.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            if (!m39878k.equals(str2)) {
                builder.put((ImmutableListMultimap.Builder) str2, (String) entry.getValue());
            }
        }
        for (String str3 : iterable) {
            builder.put((ImmutableListMultimap.Builder) m39878k, m39879j(m39878k, str3));
        }
        MediaType mediaType = new MediaType(this.f54067a, this.f54068b, builder.build());
        if (!m39878k.equals("charset")) {
            mediaType.f54072f = this.f54072f;
        }
        return (MediaType) MoreObjects.firstNonNull((MediaType) f54065k.get(mediaType), mediaType);
    }
}
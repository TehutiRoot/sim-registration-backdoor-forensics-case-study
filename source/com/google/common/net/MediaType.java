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
    public final String f54055a;

    /* renamed from: b */
    public final String f54056b;

    /* renamed from: c */
    public final ImmutableListMultimap f54057c;

    /* renamed from: d */
    public String f54058d;

    /* renamed from: e */
    public int f54059e;

    /* renamed from: f */
    public Optional f54060f;

    /* renamed from: g */
    public static final ImmutableListMultimap f54049g = ImmutableListMultimap.m40982of("charset", Ascii.toLowerCase(StandardCharsets.UTF_8.name()));

    /* renamed from: h */
    public static final CharMatcher f54050h = CharMatcher.ascii().and(CharMatcher.javaIsoControl().negate()).and(CharMatcher.isNot(TokenParser.f74560SP)).and(CharMatcher.noneOf("()<>@,;:\\\"/[]?="));

    /* renamed from: i */
    public static final CharMatcher f54051i = CharMatcher.ascii().and(CharMatcher.noneOf("\"\\\r"));

    /* renamed from: j */
    public static final CharMatcher f54052j = CharMatcher.anyOf(" \t\r\n");

    /* renamed from: k */
    public static final Map f54053k = Maps.newHashMap();
    public static final MediaType ANY_TYPE = m39892f(Marker.ANY_MARKER, Marker.ANY_MARKER);
    public static final MediaType ANY_TEXT_TYPE = m39892f(TextBundle.TEXT_ENTRY, Marker.ANY_MARKER);
    public static final MediaType ANY_IMAGE_TYPE = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, Marker.ANY_MARKER);
    public static final MediaType ANY_AUDIO_TYPE = m39892f("audio", Marker.ANY_MARKER);
    public static final MediaType ANY_VIDEO_TYPE = m39892f("video", Marker.ANY_MARKER);
    public static final MediaType ANY_APPLICATION_TYPE = m39892f("application", Marker.ANY_MARKER);
    public static final MediaType ANY_FONT_TYPE = m39892f("font", Marker.ANY_MARKER);
    public static final MediaType CACHE_MANIFEST_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "cache-manifest");
    public static final MediaType CSS_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "css");
    public static final MediaType CSV_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "csv");
    public static final MediaType HTML_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "html");
    public static final MediaType I_CALENDAR_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "calendar");
    public static final MediaType MD_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "markdown");
    public static final MediaType PLAIN_TEXT_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "plain");
    public static final MediaType TEXT_JAVASCRIPT_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "javascript");
    public static final MediaType TSV_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "tab-separated-values");
    public static final MediaType VCARD_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "vcard");
    public static final MediaType WML_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "vnd.wap.wml");
    public static final MediaType XML_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "xml");
    public static final MediaType VTT_UTF_8 = m39891g(TextBundle.TEXT_ENTRY, "vtt");
    public static final MediaType BMP = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "bmp");
    public static final MediaType CRW = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "x-canon-crw");
    public static final MediaType GIF = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "gif");
    public static final MediaType ICO = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "vnd.microsoft.icon");
    public static final MediaType JPEG = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "jpeg");
    public static final MediaType PNG = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "png");
    public static final MediaType PSD = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "vnd.adobe.photoshop");
    public static final MediaType SVG_UTF_8 = m39891g(ResponseProcessor.CONTENT_TYPE_IMAGE, "svg+xml");
    public static final MediaType TIFF = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "tiff");
    public static final MediaType WEBP = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "webp");
    public static final MediaType HEIF = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "heif");
    public static final MediaType JP2K = m39892f(ResponseProcessor.CONTENT_TYPE_IMAGE, "jp2");
    public static final MediaType MP4_AUDIO = m39892f("audio", "mp4");
    public static final MediaType MPEG_AUDIO = m39892f("audio", "mpeg");
    public static final MediaType OGG_AUDIO = m39892f("audio", "ogg");
    public static final MediaType WEBM_AUDIO = m39892f("audio", "webm");
    public static final MediaType L16_AUDIO = m39892f("audio", "l16");
    public static final MediaType L24_AUDIO = m39892f("audio", "l24");
    public static final MediaType BASIC_AUDIO = m39892f("audio", "basic");
    public static final MediaType AAC_AUDIO = m39892f("audio", "aac");
    public static final MediaType VORBIS_AUDIO = m39892f("audio", "vorbis");
    public static final MediaType WMA_AUDIO = m39892f("audio", "x-ms-wma");
    public static final MediaType WAX_AUDIO = m39892f("audio", "x-ms-wax");
    public static final MediaType VND_REAL_AUDIO = m39892f("audio", "vnd.rn-realaudio");
    public static final MediaType VND_WAVE_AUDIO = m39892f("audio", "vnd.wave");
    public static final MediaType MP4_VIDEO = m39892f("video", "mp4");
    public static final MediaType MPEG_VIDEO = m39892f("video", "mpeg");
    public static final MediaType OGG_VIDEO = m39892f("video", "ogg");
    public static final MediaType QUICKTIME = m39892f("video", "quicktime");
    public static final MediaType WEBM_VIDEO = m39892f("video", "webm");
    public static final MediaType WMV = m39892f("video", "x-ms-wmv");
    public static final MediaType FLV_VIDEO = m39892f("video", "x-flv");
    public static final MediaType THREE_GPP_VIDEO = m39892f("video", "3gpp");
    public static final MediaType THREE_GPP2_VIDEO = m39892f("video", "3gpp2");
    public static final MediaType APPLICATION_XML_UTF_8 = m39891g("application", "xml");
    public static final MediaType ATOM_UTF_8 = m39891g("application", "atom+xml");
    public static final MediaType BZIP2 = m39892f("application", "x-bzip2");
    public static final MediaType DART_UTF_8 = m39891g("application", "dart");
    public static final MediaType APPLE_PASSBOOK = m39892f("application", "vnd.apple.pkpass");
    public static final MediaType EOT = m39892f("application", "vnd.ms-fontobject");
    public static final MediaType EPUB = m39892f("application", "epub+zip");
    public static final MediaType FORM_DATA = m39892f("application", "x-www-form-urlencoded");
    public static final MediaType KEY_ARCHIVE = m39892f("application", "pkcs12");
    public static final MediaType APPLICATION_BINARY = m39892f("application", "binary");
    public static final MediaType GEO_JSON = m39892f("application", "geo+json");
    public static final MediaType GZIP = m39892f("application", "x-gzip");
    public static final MediaType HAL_JSON = m39892f("application", "hal+json");
    public static final MediaType JAVASCRIPT_UTF_8 = m39891g("application", "javascript");
    public static final MediaType JOSE = m39892f("application", "jose");
    public static final MediaType JOSE_JSON = m39892f("application", "jose+json");
    public static final MediaType JSON_UTF_8 = m39891g("application", "json");
    public static final MediaType JWT = m39892f("application", "jwt");
    public static final MediaType MANIFEST_JSON_UTF_8 = m39891g("application", "manifest+json");
    public static final MediaType KML = m39892f("application", "vnd.google-earth.kml+xml");
    public static final MediaType KMZ = m39892f("application", "vnd.google-earth.kmz");
    public static final MediaType MBOX = m39892f("application", "mbox");
    public static final MediaType APPLE_MOBILE_CONFIG = m39892f("application", "x-apple-aspen-config");
    public static final MediaType MICROSOFT_EXCEL = m39892f("application", "vnd.ms-excel");
    public static final MediaType MICROSOFT_OUTLOOK = m39892f("application", "vnd.ms-outlook");
    public static final MediaType MICROSOFT_POWERPOINT = m39892f("application", "vnd.ms-powerpoint");
    public static final MediaType MICROSOFT_WORD = m39892f("application", "msword");
    public static final MediaType MEDIA_PRESENTATION_DESCRIPTION = m39892f("application", "dash+xml");
    public static final MediaType WASM_APPLICATION = m39892f("application", "wasm");
    public static final MediaType NACL_APPLICATION = m39892f("application", "x-nacl");
    public static final MediaType NACL_PORTABLE_APPLICATION = m39892f("application", "x-pnacl");
    public static final MediaType OCTET_STREAM = m39892f("application", "octet-stream");
    public static final MediaType OGG_CONTAINER = m39892f("application", "ogg");
    public static final MediaType OOXML_DOCUMENT = m39892f("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final MediaType OOXML_PRESENTATION = m39892f("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final MediaType OOXML_SHEET = m39892f("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final MediaType OPENDOCUMENT_GRAPHICS = m39892f("application", "vnd.oasis.opendocument.graphics");
    public static final MediaType OPENDOCUMENT_PRESENTATION = m39892f("application", "vnd.oasis.opendocument.presentation");
    public static final MediaType OPENDOCUMENT_SPREADSHEET = m39892f("application", "vnd.oasis.opendocument.spreadsheet");
    public static final MediaType OPENDOCUMENT_TEXT = m39892f("application", "vnd.oasis.opendocument.text");
    public static final MediaType OPENSEARCH_DESCRIPTION_UTF_8 = m39891g("application", "opensearchdescription+xml");
    public static final MediaType PDF = m39892f("application", "pdf");
    public static final MediaType POSTSCRIPT = m39892f("application", "postscript");
    public static final MediaType PROTOBUF = m39892f("application", "protobuf");
    public static final MediaType RDF_XML_UTF_8 = m39891g("application", "rdf+xml");
    public static final MediaType RTF_UTF_8 = m39891g("application", "rtf");
    public static final MediaType SFNT = m39892f("application", "font-sfnt");
    public static final MediaType SHOCKWAVE_FLASH = m39892f("application", "x-shockwave-flash");
    public static final MediaType SKETCHUP = m39892f("application", "vnd.sketchup.skp");
    public static final MediaType SOAP_XML_UTF_8 = m39891g("application", "soap+xml");
    public static final MediaType TAR = m39892f("application", "x-tar");
    public static final MediaType WOFF = m39892f("application", "font-woff");
    public static final MediaType WOFF2 = m39892f("application", "font-woff2");
    public static final MediaType XHTML_UTF_8 = m39891g("application", "xhtml+xml");
    public static final MediaType XRD_UTF_8 = m39891g("application", "xrd+xml");
    public static final MediaType ZIP = m39892f("application", "zip");
    public static final MediaType FONT_COLLECTION = m39892f("font", "collection");
    public static final MediaType FONT_OTF = m39892f("font", "otf");
    public static final MediaType FONT_SFNT = m39892f("font", "sfnt");
    public static final MediaType FONT_TTF = m39892f("font", "ttf");
    public static final MediaType FONT_WOFF = m39892f("font", "woff");
    public static final MediaType FONT_WOFF2 = m39892f("font", "woff2");

    /* renamed from: l */
    public static final Joiner.MapJoiner f54054l = Joiner.m41322on("; ").withKeyValueSeparator("=");

    /* renamed from: com.google.common.net.MediaType$a */
    /* loaded from: classes4.dex */
    public static final class C8129a {

        /* renamed from: a */
        public final String f54061a;

        /* renamed from: b */
        public int f54062b = 0;

        public C8129a(String str) {
            this.f54061a = str;
        }

        /* renamed from: a */
        public char m39884a(char c) {
            boolean z;
            Preconditions.checkState(m39880e());
            if (m39879f() == c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f54062b++;
            return c;
        }

        /* renamed from: b */
        public char m39883b(CharMatcher charMatcher) {
            Preconditions.checkState(m39880e());
            char m39879f = m39879f();
            Preconditions.checkState(charMatcher.matches(m39879f));
            this.f54062b++;
            return m39879f;
        }

        /* renamed from: c */
        public String m39882c(CharMatcher charMatcher) {
            boolean z;
            int i = this.f54062b;
            String m39881d = m39881d(charMatcher);
            if (this.f54062b != i) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            return m39881d;
        }

        /* renamed from: d */
        public String m39881d(CharMatcher charMatcher) {
            Preconditions.checkState(m39880e());
            int i = this.f54062b;
            this.f54062b = charMatcher.negate().indexIn(this.f54061a, i);
            if (m39880e()) {
                return this.f54061a.substring(i, this.f54062b);
            }
            return this.f54061a.substring(i);
        }

        /* renamed from: e */
        public boolean m39880e() {
            int i = this.f54062b;
            if (i >= 0 && i < this.f54061a.length()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public char m39879f() {
            Preconditions.checkState(m39880e());
            return this.f54061a.charAt(this.f54062b);
        }
    }

    public MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f54055a = str;
        this.f54056b = str2;
        this.f54057c = immutableListMultimap;
    }

    /* renamed from: a */
    public static /* synthetic */ String m39897a(String str) {
        return m39889i(str);
    }

    /* renamed from: b */
    public static MediaType m39896b(MediaType mediaType) {
        f54053k.put(mediaType, mediaType);
        return mediaType;
    }

    public static MediaType create(String str, String str2) {
        MediaType m39893e = m39893e(str, str2, ImmutableListMultimap.m40983of());
        m39893e.f54060f = Optional.absent();
        return m39893e;
    }

    /* renamed from: d */
    public static void m39894d(C8129a c8129a, char c) {
        CharMatcher charMatcher = f54052j;
        c8129a.m39881d(charMatcher);
        c8129a.m39884a(c);
        c8129a.m39881d(charMatcher);
    }

    /* renamed from: e */
    public static MediaType m39893e(String str, String str2, Multimap multimap) {
        boolean z;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(multimap);
        String m39886k = m39886k(str);
        String m39886k2 = m39886k(str2);
        if (Marker.ANY_MARKER.equals(m39886k) && !Marker.ANY_MARKER.equals(m39886k2)) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "A wildcard type cannot be used with a non-wildcard subtype");
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        for (Map.Entry entry : multimap.entries()) {
            String m39886k3 = m39886k((String) entry.getKey());
            builder.put((ImmutableListMultimap.Builder) m39886k3, m39887j(m39886k3, (String) entry.getValue()));
        }
        MediaType mediaType = new MediaType(m39886k, m39886k2, builder.build());
        return (MediaType) MoreObjects.firstNonNull((MediaType) f54053k.get(mediaType), mediaType);
    }

    /* renamed from: f */
    public static MediaType m39892f(String str, String str2) {
        MediaType m39896b = m39896b(new MediaType(str, str2, ImmutableListMultimap.m40983of()));
        m39896b.f54060f = Optional.absent();
        return m39896b;
    }

    /* renamed from: g */
    public static MediaType m39891g(String str, String str2) {
        MediaType m39896b = m39896b(new MediaType(str, str2, f54049g));
        m39896b.f54060f = Optional.m41313of(StandardCharsets.UTF_8);
        return m39896b;
    }

    /* renamed from: h */
    public static String m39890h(String str) {
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
    public static /* synthetic */ String m39889i(String str) {
        if (!f54050h.matchesAllOf(str) || str.isEmpty()) {
            return m39890h(str);
        }
        return str;
    }

    /* renamed from: j */
    public static String m39887j(String str, String str2) {
        Preconditions.checkNotNull(str2);
        Preconditions.checkArgument(CharMatcher.ascii().matchesAllOf(str2), "parameter values must be ASCII: %s", str2);
        if ("charset".equals(str)) {
            return Ascii.toLowerCase(str2);
        }
        return str2;
    }

    /* renamed from: k */
    public static String m39886k(String str) {
        Preconditions.checkArgument(f54050h.matchesAllOf(str));
        Preconditions.checkArgument(!str.isEmpty());
        return Ascii.toLowerCase(str);
    }

    @CanIgnoreReturnValue
    public static MediaType parse(String str) {
        String m39882c;
        Preconditions.checkNotNull(str);
        C8129a c8129a = new C8129a(str);
        try {
            CharMatcher charMatcher = f54050h;
            String m39882c2 = c8129a.m39882c(charMatcher);
            m39894d(c8129a, '/');
            String m39882c3 = c8129a.m39882c(charMatcher);
            ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
            while (c8129a.m39880e()) {
                m39894d(c8129a, ';');
                CharMatcher charMatcher2 = f54050h;
                String m39882c4 = c8129a.m39882c(charMatcher2);
                m39894d(c8129a, '=');
                if ('\"' == c8129a.m39879f()) {
                    c8129a.m39884a('\"');
                    StringBuilder sb = new StringBuilder();
                    while ('\"' != c8129a.m39879f()) {
                        if ('\\' == c8129a.m39879f()) {
                            c8129a.m39884a('\\');
                            sb.append(c8129a.m39883b(CharMatcher.ascii()));
                        } else {
                            sb.append(c8129a.m39882c(f54051i));
                        }
                    }
                    m39882c = sb.toString();
                    c8129a.m39884a('\"');
                } else {
                    m39882c = c8129a.m39882c(charMatcher2);
                }
                builder.put((ImmutableListMultimap.Builder) m39882c4, m39882c);
            }
            return m39893e(m39882c2, m39882c3, builder.build());
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("Could not parse '" + str + OperatorName.SHOW_TEXT_LINE, e);
        }
    }

    /* renamed from: c */
    public final String m39895c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54055a);
        sb.append('/');
        sb.append(this.f54056b);
        if (!this.f54057c.isEmpty()) {
            sb.append("; ");
            f54054l.appendTo(sb, Multimaps.transformValues((ListMultimap) this.f54057c, new Function() { // from class: Tr0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return MediaType.m39897a((String) obj);
                }
            }).entries());
        }
        return sb.toString();
    }

    public Optional<Charset> charset() {
        Optional<Charset> optional = this.f54060f;
        if (optional == null) {
            optional = Optional.absent();
            UnmodifiableIterator it = this.f54057c.get((ImmutableListMultimap) "charset").iterator();
            String str = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str == null) {
                    optional = Optional.m41313of(Charset.forName(str2));
                    str = str2;
                } else if (!str.equals(str2)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + str2);
                }
            }
            this.f54060f = optional;
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
        if (this.f54055a.equals(mediaType.f54055a) && this.f54056b.equals(mediaType.f54056b) && m39885l().equals(mediaType.m39885l())) {
            return true;
        }
        return false;
    }

    public boolean hasWildcard() {
        if (!Marker.ANY_MARKER.equals(this.f54055a) && !Marker.ANY_MARKER.equals(this.f54056b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f54059e;
        if (i == 0) {
            int hashCode = Objects.hashCode(this.f54055a, this.f54056b, m39885l());
            this.f54059e = hashCode;
            return hashCode;
        }
        return i;
    }

    /* renamed from: is */
    public boolean m39888is(MediaType mediaType) {
        if ((mediaType.f54055a.equals(Marker.ANY_MARKER) || mediaType.f54055a.equals(this.f54055a)) && ((mediaType.f54056b.equals(Marker.ANY_MARKER) || mediaType.f54056b.equals(this.f54056b)) && this.f54057c.entries().containsAll(mediaType.f54057c.entries()))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final Map m39885l() {
        return Maps.transformValues(this.f54057c.asMap(), new Function() { // from class: Ur0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyOf((Collection) obj);
            }
        });
    }

    public ImmutableListMultimap<String, String> parameters() {
        return this.f54057c;
    }

    public String subtype() {
        return this.f54056b;
    }

    public String toString() {
        String str = this.f54058d;
        if (str == null) {
            String m39895c = m39895c();
            this.f54058d = m39895c;
            return m39895c;
        }
        return str;
    }

    public String type() {
        return this.f54055a;
    }

    public MediaType withCharset(Charset charset) {
        Preconditions.checkNotNull(charset);
        MediaType withParameter = withParameter("charset", charset.name());
        withParameter.f54060f = Optional.m41313of(charset);
        return withParameter;
    }

    public MediaType withParameter(String str, String str2) {
        return withParameters(str, ImmutableSet.m40930of(str2));
    }

    public MediaType withParameters(Multimap<String, String> multimap) {
        return m39893e(this.f54055a, this.f54056b, multimap);
    }

    public MediaType withoutParameters() {
        if (this.f54057c.isEmpty()) {
            return this;
        }
        return create(this.f54055a, this.f54056b);
    }

    public MediaType withParameters(String str, Iterable<String> iterable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(iterable);
        String m39886k = m39886k(str);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        UnmodifiableIterator it = this.f54057c.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            if (!m39886k.equals(str2)) {
                builder.put((ImmutableListMultimap.Builder) str2, (String) entry.getValue());
            }
        }
        for (String str3 : iterable) {
            builder.put((ImmutableListMultimap.Builder) m39886k, m39887j(m39886k, str3));
        }
        MediaType mediaType = new MediaType(this.f54055a, this.f54056b, builder.build());
        if (!m39886k.equals("charset")) {
            mediaType.f54060f = this.f54060f;
        }
        return (MediaType) MoreObjects.firstNonNull((MediaType) f54053k.get(mediaType), mediaType);
    }
}

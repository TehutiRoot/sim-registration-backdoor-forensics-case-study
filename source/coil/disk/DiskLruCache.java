package coil.disk;

import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.joran.action.Action;
import coil.util.FileSystems;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.BufferedSink;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0007*\u0001X\b\u0000\u0018\u0000 Z2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004Z[\\]B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010!\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u001dR\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u001f2\n\u0010&\u001a\u00060%R\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010$J\u000f\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u001aJ\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0013J\u001e\u00102\u001a\b\u0018\u000101R\u00020\u00002\u0006\u0010.\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\n¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010\u0013J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013J\r\u0010<\u001a\u00020\u0011¢\u0006\u0004\b<\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010AR\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010>R\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010>R8\u0010K\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u00060%R\u00020\u00000Gj\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u00060%R\u00020\u0000`H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010MR\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010O\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010AR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010PR\u0016\u0010S\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010RR\u0016\u0010T\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010RR\u0016\u0010U\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010RR\u0016\u0010V\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010RR\u0016\u0010W\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010RR\u0014\u0010\u0005\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010Y¨\u0006^"}, m28850d2 = {"Lcoil/disk/DiskLruCache;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "directory", "Lkotlinx/coroutines/CoroutineDispatcher;", "cleanupDispatcher", "", "maxSize", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "valueCount", "<init>", "(Lokio/FileSystem;Lokio/Path;Lkotlinx/coroutines/CoroutineDispatcher;JII)V", "", OperatorName.MOVE_TO, "()V", "Lokio/BufferedSink;", OperatorName.NON_STROKING_CMYK, "()Lokio/BufferedSink;", "", "line", OperatorName.ENDPATH, "(Ljava/lang/String;)V", OperatorName.LINE_TO, OperatorName.CLOSE_AND_STROKE, "Lcoil/disk/DiskLruCache$Editor;", "editor", "", FirebaseAnalytics.Param.SUCCESS, "d", "(Lcoil/disk/DiskLruCache$Editor;Z)V", "i", "()Z", "Lcoil/disk/DiskLruCache$Entry;", "entry", "o", "(Lcoil/disk/DiskLruCache$Entry;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SAVE, "p", OperatorName.NON_STROKING_GRAY, OperatorName.SET_LINE_JOINSTYLE, Action.KEY_ATTRIBUTE, PDPageLabelRange.STYLE_ROMAN_LOWER, "initialize", "Lcoil/disk/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lcoil/disk/DiskLruCache$Snapshot;", "edit", "(Ljava/lang/String;)Lcoil/disk/DiskLruCache$Editor;", "size", "()J", ProductAction.ACTION_REMOVE, "(Ljava/lang/String;)Z", "close", "flush", "evictAll", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/Path;", OperatorName.SET_LINE_CAPSTYLE, OperatorName.CURVE_TO, "I", "e", "journalFile", OperatorName.FILL_NON_ZERO, "journalFileTmp", "journalFileBackup", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", OperatorName.CLOSE_PATH, "Ljava/util/LinkedHashMap;", "lruEntries", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "cleanupScope", "operationsSinceRewrite", "Lokio/BufferedSink;", "journalWriter", "Z", "hasJournalErrors", "initialized", "closed", "mostRecentTrimFailed", "mostRecentRebuildFailed", "coil/disk/DiskLruCache$fileSystem$1", "Lcoil/disk/DiskLruCache$fileSystem$1;", "Companion", "Editor", "Entry", "Snapshot", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 FileSystem.kt\nokio/FileSystem\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,869:1\n1#2:870\n64#3:871\n52#3,5:873\n60#3,7:879\n57#3,13:886\n52#3,5:909\n60#3,7:915\n57#3,13:922\n66#4:872\n67#4:878\n79#4:906\n160#4:907\n80#4:908\n81#4:914\n361#5,7:899\n37#6,2:935\n37#6,2:937\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n*L\n207#1:871\n207#1:873,5\n207#1:879,7\n207#1:886,13\n320#1:909,5\n320#1:915,7\n320#1:922,13\n207#1:872\n207#1:878\n320#1:906\n320#1:907\n320#1:908\n320#1:914\n270#1:899,7\n585#1:935,2\n641#1:937,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {
    @NotNull
    public static final String JOURNAL_FILE = "journal";
    @NotNull
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    @NotNull
    public static final String JOURNAL_FILE_TMP = "journal.tmp";
    @NotNull
    public static final String MAGIC = "libcore.io.DiskLruCache";
    @NotNull
    public static final String VERSION = "1";

    /* renamed from: a */
    public final Path f40511a;

    /* renamed from: b */
    public final long f40512b;

    /* renamed from: c */
    public final int f40513c;

    /* renamed from: d */
    public final int f40514d;

    /* renamed from: e */
    public final Path f40515e;

    /* renamed from: f */
    public final Path f40516f;

    /* renamed from: g */
    public final Path f40517g;

    /* renamed from: h */
    public final LinkedHashMap f40518h;

    /* renamed from: i */
    public final CoroutineScope f40519i;

    /* renamed from: j */
    public long f40520j;

    /* renamed from: k */
    public int f40521k;

    /* renamed from: l */
    public BufferedSink f40522l;

    /* renamed from: m */
    public boolean f40523m;

    /* renamed from: n */
    public boolean f40524n;

    /* renamed from: o */
    public boolean f40525o;

    /* renamed from: p */
    public boolean f40526p;

    /* renamed from: q */
    public boolean f40527q;

    /* renamed from: r */
    public final DiskLruCache$fileSystem$1 f40528r;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: s */
    public static final Regex f40510s = new Regex("[a-z0-9_-]{1,120}");

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002¨\u0006\u0014"}, m28850d2 = {"Lcoil/disk/DiskLruCache$Companion;", "", "()V", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "getJOURNAL_FILE$coil_base_release$annotations", "JOURNAL_FILE_BACKUP", "getJOURNAL_FILE_BACKUP$coil_base_release$annotations", "JOURNAL_FILE_TMP", "getJOURNAL_FILE_TMP$coil_base_release$annotations", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "getMAGIC$coil_base_release$annotations", "READ", "REMOVE", "VERSION", "getVERSION$coil_base_release$annotations", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getJOURNAL_FILE$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getJOURNAL_FILE_BACKUP$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getJOURNAL_FILE_TMP$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getMAGIC$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getVERSION$coil_base_release$annotations() {
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0018\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m28850d2 = {"Lcoil/disk/DiskLruCache$Editor;", "", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "entry", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "", FirebaseAnalytics.Param.INDEX, "Lokio/Path;", "file", "(I)Lokio/Path;", "", "detach", "()V", "commit", "Lcoil/disk/DiskLruCache$Snapshot;", "commitAndGet", "()Lcoil/disk/DiskLruCache$Snapshot;", "abort", "", FirebaseAnalytics.Param.SUCCESS, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Z)V", "Lcoil/disk/DiskLruCache$Entry;", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "closed", "", OperatorName.CURVE_TO, "[Z", "getWritten", "()[Z", "written", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Editor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    /* loaded from: classes3.dex */
    public final class Editor {

        /* renamed from: a */
        public final Entry f40529a;

        /* renamed from: b */
        public boolean f40530b;

        /* renamed from: c */
        public final boolean[] f40531c;

        public Editor(@NotNull Entry entry) {
            this.f40529a = entry;
            this.f40531c = new boolean[DiskLruCache.this.f40514d];
        }

        /* renamed from: a */
        public final void m51088a(boolean z) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (!this.f40530b) {
                        if (Intrinsics.areEqual(this.f40529a.getCurrentEditor(), this)) {
                            diskLruCache.m51101d(this, z);
                        }
                        this.f40530b = true;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("editor is closed".toString());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void abort() {
            m51088a(false);
        }

        public final void commit() {
            m51088a(true);
        }

        @Nullable
        public final Snapshot commitAndGet() {
            Snapshot snapshot;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                commit();
                snapshot = diskLruCache.get(this.f40529a.getKey());
            }
            return snapshot;
        }

        public final void detach() {
            if (Intrinsics.areEqual(this.f40529a.getCurrentEditor(), this)) {
                this.f40529a.setZombie(true);
            }
        }

        @NotNull
        public final Path file(int i) {
            Path path;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.f40530b) {
                    this.f40531c[i] = true;
                    Path path2 = this.f40529a.getDirtyFiles().get(i);
                    FileSystems.createFile(diskLruCache.f40528r, path2);
                    path = path2;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return path;
        }

        @NotNull
        public final Entry getEntry() {
            return this.f40529a;
        }

        @NotNull
        public final boolean[] getWritten() {
            return this.f40531c;
        }
    }

    @Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R'\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R(\u0010;\u001a\b\u0018\u000104R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, m28850d2 = {"Lcoil/disk/DiskLruCache$Entry;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Lcoil/disk/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "setLengths", "(Ljava/util/List;)V", "Lokio/BufferedSink;", "writer", "writeLengths", "(Lokio/BufferedSink;)V", "Lcoil/disk/DiskLruCache$Snapshot;", "Lcoil/disk/DiskLruCache;", "snapshot", "()Lcoil/disk/DiskLruCache$Snapshot;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[J", "getLengths", "()[J", "lengths", "Ljava/util/ArrayList;", "Lokio/Path;", "Lkotlin/collections/ArrayList;", OperatorName.CURVE_TO, "Ljava/util/ArrayList;", "getCleanFiles", "()Ljava/util/ArrayList;", "cleanFiles", "d", "getDirtyFiles", "dirtyFiles", "", "e", "Z", "getReadable", "()Z", "setReadable", "(Z)V", "readable", OperatorName.FILL_NON_ZERO, "getZombie", "setZombie", "zombie", "Lcoil/disk/DiskLruCache$Editor;", OperatorName.NON_STROKING_GRAY, "Lcoil/disk/DiskLruCache$Editor;", "getCurrentEditor", "()Lcoil/disk/DiskLruCache$Editor;", "setCurrentEditor", "(Lcoil/disk/DiskLruCache$Editor;)V", "currentEditor", "", OperatorName.CLOSE_PATH, "I", "getLockingSnapshotCount", "()I", "setLockingSnapshotCount", "(I)V", "lockingSnapshotCount", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n+ 2 Collections.kt\ncoil/util/-Collections\n*L\n1#1,869:1\n12#2,4:870\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n*L\n841#1:870,4\n*E\n"})
    /* loaded from: classes3.dex */
    public final class Entry {

        /* renamed from: a */
        public final String f40533a;

        /* renamed from: b */
        public final long[] f40534b;

        /* renamed from: c */
        public final ArrayList f40535c;

        /* renamed from: d */
        public final ArrayList f40536d;

        /* renamed from: e */
        public boolean f40537e;

        /* renamed from: f */
        public boolean f40538f;

        /* renamed from: g */
        public Editor f40539g;

        /* renamed from: h */
        public int f40540h;

        public Entry(@NotNull String str) {
            this.f40533a = str;
            this.f40534b = new long[DiskLruCache.this.f40514d];
            this.f40535c = new ArrayList(DiskLruCache.this.f40514d);
            this.f40536d = new ArrayList(DiskLruCache.this.f40514d);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = DiskLruCache.this.f40514d;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.f40535c.add(DiskLruCache.this.f40511a.resolve(sb.toString()));
                sb.append(".tmp");
                this.f40536d.add(DiskLruCache.this.f40511a.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        @NotNull
        public final ArrayList<Path> getCleanFiles() {
            return this.f40535c;
        }

        @Nullable
        public final Editor getCurrentEditor() {
            return this.f40539g;
        }

        @NotNull
        public final ArrayList<Path> getDirtyFiles() {
            return this.f40536d;
        }

        @NotNull
        public final String getKey() {
            return this.f40533a;
        }

        @NotNull
        public final long[] getLengths() {
            return this.f40534b;
        }

        public final int getLockingSnapshotCount() {
            return this.f40540h;
        }

        public final boolean getReadable() {
            return this.f40537e;
        }

        public final boolean getZombie() {
            return this.f40538f;
        }

        public final void setCurrentEditor(@Nullable Editor editor) {
            this.f40539g = editor;
        }

        public final void setLengths(@NotNull List<String> list) {
            if (list.size() == DiskLruCache.this.f40514d) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.f40534b[i] = Long.parseLong(list.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            }
            throw new IOException("unexpected journal line: " + list);
        }

        public final void setLockingSnapshotCount(int i) {
            this.f40540h = i;
        }

        public final void setReadable(boolean z) {
            this.f40537e = z;
        }

        public final void setZombie(boolean z) {
            this.f40538f = z;
        }

        @Nullable
        public final Snapshot snapshot() {
            if (!this.f40537e || this.f40539g != null || this.f40538f) {
                return null;
            }
            ArrayList arrayList = this.f40535c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!diskLruCache.f40528r.exists((Path) arrayList.get(i))) {
                    try {
                        diskLruCache.m51093o(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f40540h++;
            return new Snapshot(this);
        }

        public final void writeLengths(@NotNull BufferedSink bufferedSink) {
            for (long j : this.f40534b) {
                bufferedSink.writeByte(32).writeDecimalLong(j);
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m28850d2 = {"Lcoil/disk/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "entry", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "", FirebaseAnalytics.Param.INDEX, "Lokio/Path;", "file", "(I)Lokio/Path;", "", "close", "()V", "Lcoil/disk/DiskLruCache$Editor;", "closeAndEdit", "()Lcoil/disk/DiskLruCache$Editor;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/disk/DiskLruCache$Entry;", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "closed", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Snapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    /* loaded from: classes3.dex */
    public final class Snapshot implements Closeable {

        /* renamed from: a */
        public final Entry f40542a;

        /* renamed from: b */
        public boolean f40543b;

        public Snapshot(@NotNull Entry entry) {
            this.f40542a = entry;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f40543b) {
                this.f40543b = true;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    try {
                        Entry entry = this.f40542a;
                        entry.setLockingSnapshotCount(entry.getLockingSnapshotCount() - 1);
                        if (this.f40542a.getLockingSnapshotCount() == 0 && this.f40542a.getZombie()) {
                            diskLruCache.m51093o(this.f40542a);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Nullable
        public final Editor closeAndEdit() {
            Editor edit;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                edit = diskLruCache.edit(this.f40542a.getKey());
            }
            return edit;
        }

        @NotNull
        public final Path file(int i) {
            if (!this.f40543b) {
                return this.f40542a.getCleanFiles().get(i);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        @NotNull
        public final Entry getEntry() {
            return this.f40542a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [coil.disk.DiskLruCache$fileSystem$1] */
    public DiskLruCache(@NotNull final FileSystem fileSystem, @NotNull Path path, @NotNull CoroutineDispatcher coroutineDispatcher, long j, int i, int i2) {
        this.f40511a = path;
        this.f40512b = j;
        this.f40513c = i;
        this.f40514d = i2;
        if (j > 0) {
            if (i2 > 0) {
                this.f40515e = path.resolve(JOURNAL_FILE);
                this.f40516f = path.resolve(JOURNAL_FILE_TMP);
                this.f40517g = path.resolve(JOURNAL_FILE_BACKUP);
                this.f40518h = new LinkedHashMap(0, 0.75f, true);
                this.f40519i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
                this.f40528r = new ForwardingFileSystem(fileSystem) { // from class: coil.disk.DiskLruCache$fileSystem$1
                    @Override // okio.ForwardingFileSystem, okio.FileSystem
                    @NotNull
                    public Sink sink(@NotNull Path path2, boolean z) {
                        Path parent = path2.parent();
                        if (parent != null) {
                            createDirectories(parent);
                        }
                        return super.sink(path2, z);
                    }
                };
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: b */
    public final void m51102b() {
        if (!this.f40525o) {
            return;
        }
        throw new IllegalStateException("cache is closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f40524n && !this.f40525o) {
                for (Entry entry : (Entry[]) this.f40518h.values().toArray(new Entry[0])) {
                    Editor currentEditor = entry.getCurrentEditor();
                    if (currentEditor != null) {
                        currentEditor.detach();
                    }
                }
                m51091q();
                CoroutineScopeKt.cancel$default(this.f40519i, null, 1, null);
                BufferedSink bufferedSink = this.f40522l;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.close();
                this.f40522l = null;
                this.f40525o = true;
                return;
            }
            this.f40525o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final synchronized void m51101d(Editor editor, boolean z) {
        long j;
        Entry entry = editor.getEntry();
        if (Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            int i = 0;
            if (z && !entry.getZombie()) {
                int i2 = this.f40514d;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (editor.getWritten()[i3] && !exists(entry.getDirtyFiles().get(i3))) {
                        editor.abort();
                        return;
                    }
                }
                int i4 = this.f40514d;
                while (i < i4) {
                    Path path = entry.getDirtyFiles().get(i);
                    Path path2 = entry.getCleanFiles().get(i);
                    if (exists(path)) {
                        atomicMove(path, path2);
                    } else {
                        FileSystems.createFile(this.f40528r, entry.getCleanFiles().get(i));
                    }
                    long j2 = entry.getLengths()[i];
                    Long size = metadata(path2).getSize();
                    if (size != null) {
                        j = size.longValue();
                    } else {
                        j = 0;
                    }
                    entry.getLengths()[i] = j;
                    this.f40520j = (this.f40520j - j2) + j;
                    i++;
                }
            } else {
                int i5 = this.f40514d;
                while (i < i5) {
                    delete(entry.getDirtyFiles().get(i));
                    i++;
                }
            }
            entry.setCurrentEditor(null);
            if (entry.getZombie()) {
                m51093o(entry);
                return;
            }
            this.f40521k++;
            BufferedSink bufferedSink = this.f40522l;
            Intrinsics.checkNotNull(bufferedSink);
            if (!z && !entry.getReadable()) {
                this.f40518h.remove(entry.getKey());
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f40520j <= this.f40512b || m51099i()) {
                    m51098j();
                }
                return;
            }
            entry.setReadable(true);
            bufferedSink.writeUtf8("CLEAN");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            entry.writeLengths(bufferedSink);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.f40520j <= this.f40512b) {
            }
            m51098j();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Nullable
    public final synchronized Editor edit(@NotNull String str) {
        Editor editor;
        m51102b();
        m51090r(str);
        initialize();
        Entry entry = (Entry) this.f40518h.get(str);
        if (entry != null) {
            editor = entry.getCurrentEditor();
        } else {
            editor = null;
        }
        if (editor != null) {
            return null;
        }
        if (entry != null && entry.getLockingSnapshotCount() != 0) {
            return null;
        }
        if (!this.f40526p && !this.f40527q) {
            BufferedSink bufferedSink = this.f40522l;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.f40523m) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(str);
                this.f40518h.put(str, entry);
            }
            Editor editor2 = new Editor(entry);
            entry.setCurrentEditor(editor2);
            return editor2;
        }
        m51098j();
        return null;
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            for (Entry entry : (Entry[]) this.f40518h.values().toArray(new Entry[0])) {
                m51093o(entry);
            }
            this.f40526p = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.f40524n) {
            return;
        }
        m51102b();
        m51091q();
        BufferedSink bufferedSink = this.f40522l;
        Intrinsics.checkNotNull(bufferedSink);
        bufferedSink.flush();
    }

    /* renamed from: g */
    public final void m51100g() {
        close();
        FileSystems.deleteContents(this.f40528r, this.f40511a);
    }

    @Nullable
    public final synchronized Snapshot get(@NotNull String str) {
        Snapshot snapshot;
        m51102b();
        m51090r(str);
        initialize();
        Entry entry = (Entry) this.f40518h.get(str);
        if (entry != null && (snapshot = entry.snapshot()) != null) {
            this.f40521k++;
            BufferedSink bufferedSink = this.f40522l;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8("READ");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            if (m51099i()) {
                m51098j();
            }
            return snapshot;
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m51099i() {
        if (this.f40521k >= 2000) {
            return true;
        }
        return false;
    }

    public final synchronized void initialize() {
        try {
            if (this.f40524n) {
                return;
            }
            delete(this.f40516f);
            if (exists(this.f40517g)) {
                if (exists(this.f40515e)) {
                    delete(this.f40517g);
                } else {
                    atomicMove(this.f40517g, this.f40515e);
                }
            }
            if (exists(this.f40515e)) {
                try {
                    m51095m();
                    m51096l();
                    this.f40524n = true;
                    return;
                } catch (IOException unused) {
                    m51100g();
                    this.f40525o = false;
                }
            }
            m51089s();
            this.f40524n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    public final void m51098j() {
        AbstractC1552Vc.m65753e(this.f40519i, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    /* renamed from: k */
    public final BufferedSink m51097k() {
        return Okio.buffer(new FaultHidingSink(appendingSink(this.f40515e), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    /* renamed from: l */
    public final void m51096l() {
        Iterator it = this.f40518h.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i = 0;
            if (entry.getCurrentEditor() == null) {
                int i2 = this.f40514d;
                while (i < i2) {
                    j += entry.getLengths()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor(null);
                int i3 = this.f40514d;
                while (i < i3) {
                    delete(entry.getCleanFiles().get(i));
                    delete(entry.getDirtyFiles().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f40520j = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51095m() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            coil.disk.DiskLruCache$fileSystem$1 r1 = r12.f40528r
            okio.Path r2 = r12.f40515e
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r2 = 0
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r3)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            java.lang.String r8 = "1"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r12.f40513c     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r5)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r12.f40514d     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r6)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L5c
            if (r8 > 0) goto L81
            r0 = 0
        L52:
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            r12.m51094n(r3)     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            int r0 = r0 + 1
            goto L52
        L5c:
            r0 = move-exception
            goto Lb5
        L5e:
            java.util.LinkedHashMap r3 = r12.f40518h     // Catch: java.lang.Throwable -> L5c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r3
            r12.f40521k = r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L71
            r12.m51089s()     // Catch: java.lang.Throwable -> L5c
            goto L77
        L71:
            okio.BufferedSink r0 = r12.m51097k()     // Catch: java.lang.Throwable -> L5c
            r12.f40522l = r0     // Catch: java.lang.Throwable -> L5c
        L77:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lc2
            r1.close()     // Catch: java.lang.Throwable -> L7f
            goto Lc2
        L7f:
            r2 = move-exception
            goto Lc2
        L81:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r9.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch: java.lang.Throwable -> L5c
            r9.append(r3)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r4)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r5)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r6)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = 93
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L5c
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r8     // Catch: java.lang.Throwable -> L5c
        Lb5:
            if (r1 == 0) goto Lbf
            r1.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r1 = move-exception
            p000.AbstractC5370bT.addSuppressed(r0, r1)
        Lbf:
            r11 = r2
            r2 = r0
            r0 = r11
        Lc2:
            if (r2 != 0) goto Lc8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return
        Lc8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.m51095m():void");
    }

    /* renamed from: n */
    public final void m51094n(String str) {
        String substring;
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, (char) TokenParser.f74560SP, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            int i = indexOf$default + 1;
            int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, (char) TokenParser.f74560SP, i, false, 4, (Object) null);
            if (indexOf$default2 == -1) {
                substring = str.substring(i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                if (indexOf$default == 6 && AbstractC20204hN1.startsWith$default(str, "REMOVE", false, 2, null)) {
                    this.f40518h.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedHashMap linkedHashMap = this.f40518h;
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new Entry(substring);
                linkedHashMap.put(substring, obj);
            }
            Entry entry = (Entry) obj;
            if (indexOf$default2 != -1 && indexOf$default == 5 && AbstractC20204hN1.startsWith$default(str, "CLEAN", false, 2, null)) {
                String substring2 = str.substring(indexOf$default2 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{TokenParser.f74560SP}, false, 0, 6, (Object) null);
                entry.setReadable(true);
                entry.setCurrentEditor(null);
                entry.setLengths(split$default);
                return;
            } else if (indexOf$default2 == -1 && indexOf$default == 5 && AbstractC20204hN1.startsWith$default(str, "DIRTY", false, 2, null)) {
                entry.setCurrentEditor(new Editor(entry));
                return;
            } else if (indexOf$default2 == -1 && indexOf$default == 4 && AbstractC20204hN1.startsWith$default(str, "READ", false, 2, null)) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: o */
    public final boolean m51093o(Entry entry) {
        BufferedSink bufferedSink;
        if (entry.getLockingSnapshotCount() > 0 && (bufferedSink = this.f40522l) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (entry.getLockingSnapshotCount() <= 0 && entry.getCurrentEditor() == null) {
            int i = this.f40514d;
            for (int i2 = 0; i2 < i; i2++) {
                delete(entry.getCleanFiles().get(i2));
                this.f40520j -= entry.getLengths()[i2];
                entry.getLengths()[i2] = 0;
            }
            this.f40521k++;
            BufferedSink bufferedSink2 = this.f40522l;
            if (bufferedSink2 != null) {
                bufferedSink2.writeUtf8("REMOVE");
                bufferedSink2.writeByte(32);
                bufferedSink2.writeUtf8(entry.getKey());
                bufferedSink2.writeByte(10);
            }
            this.f40518h.remove(entry.getKey());
            if (m51099i()) {
                m51098j();
            }
            return true;
        }
        entry.setZombie(true);
        return true;
    }

    /* renamed from: p */
    public final boolean m51092p() {
        for (Entry entry : this.f40518h.values()) {
            if (!entry.getZombie()) {
                m51093o(entry);
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final void m51091q() {
        while (this.f40520j > this.f40512b) {
            if (!m51092p()) {
                return;
            }
        }
        this.f40526p = false;
    }

    /* renamed from: r */
    public final void m51090r(String str) {
        if (f40510s.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized boolean remove(@NotNull String str) {
        m51102b();
        m51090r(str);
        initialize();
        Entry entry = (Entry) this.f40518h.get(str);
        if (entry == null) {
            return false;
        }
        boolean m51093o = m51093o(entry);
        if (m51093o && this.f40520j <= this.f40512b) {
            this.f40526p = false;
        }
        return m51093o;
    }

    /* renamed from: s */
    public final synchronized void m51089s() {
        try {
            BufferedSink bufferedSink = this.f40522l;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink buffer = Okio.buffer(sink(this.f40516f, false));
            Throwable th2 = null;
            buffer.writeUtf8(MAGIC).writeByte(10);
            buffer.writeUtf8("1").writeByte(10);
            buffer.writeDecimalLong(this.f40513c).writeByte(10);
            buffer.writeDecimalLong(this.f40514d).writeByte(10);
            buffer.writeByte(10);
            for (Entry entry : this.f40518h.values()) {
                if (entry.getCurrentEditor() != null) {
                    buffer.writeUtf8("DIRTY");
                    buffer.writeByte(32);
                    buffer.writeUtf8(entry.getKey());
                    buffer.writeByte(10);
                } else {
                    buffer.writeUtf8("CLEAN");
                    buffer.writeByte(32);
                    buffer.writeUtf8(entry.getKey());
                    entry.writeLengths(buffer);
                    buffer.writeByte(10);
                }
            }
            Unit unit = Unit.INSTANCE;
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            if (th2 == null) {
                Intrinsics.checkNotNull(unit);
                if (exists(this.f40515e)) {
                    atomicMove(this.f40515e, this.f40517g);
                    atomicMove(this.f40516f, this.f40515e);
                    delete(this.f40517g);
                } else {
                    atomicMove(this.f40516f, this.f40515e);
                }
                this.f40522l = m51097k();
                this.f40521k = 0;
                this.f40523m = false;
                this.f40527q = false;
            } else {
                throw th2;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized long size() {
        initialize();
        return this.f40520j;
    }
}

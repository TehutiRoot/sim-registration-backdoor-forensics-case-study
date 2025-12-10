package coil.util;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import coil.disk.DiskCache;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.FilesKt__UtilsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m28850d2 = {"Lcoil/util/SingletonDiskCache;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcoil/disk/DiskCache;", "get", "(Landroid/content/Context;)Lcoil/disk/DiskCache;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/disk/DiskCache;", "instance", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes3.dex */
public final class SingletonDiskCache {
    @NotNull
    public static final SingletonDiskCache INSTANCE = new SingletonDiskCache();

    /* renamed from: a */
    public static DiskCache f40870a;

    @NotNull
    public final synchronized DiskCache get(@NotNull Context context) {
        DiskCache diskCache;
        diskCache = f40870a;
        if (diskCache == null) {
            diskCache = new DiskCache.Builder().directory(FilesKt__UtilsKt.resolve(Utils.getSafeCacheDir(context), "image_cache")).build();
            f40870a = diskCache;
        }
        return diskCache;
    }
}

package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, m28850d2 = {"", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Z", "Lokio/Buffer;", "isProbablyPlainText", "(Lokio/Buffer;)Z", "Lokio/ByteString;", "(Lokio/ByteString;)Z", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkioUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioUtils.kt\ncom/chuckerteam/chucker/internal/support/OkioUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,34:1\n1206#2,2:35\n*S KotlinDebug\n*F\n+ 1 OkioUtils.kt\ncom/chuckerteam/chucker/internal/support/OkioUtilsKt\n*L\n22#1:35,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OkioUtilsKt {
    /* renamed from: a */
    public static final boolean m49915a(int i) {
        if (!Character.isWhitespace(i) && Character.isISOControl(i)) {
            return false;
        }
        return true;
    }

    public static final boolean isProbablyPlainText(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, Math.min(buffer.size(), 64L));
            for (Number number : SequencesKt___SequencesKt.take(SequencesKt__SequenceBuilderKt.sequence(new OkioUtilsKt$isProbablyPlainText$1(buffer2, null)), 16)) {
                if (!m49915a(number.intValue())) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final boolean isProbablyPlainText(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return isProbablyPlainText(new Buffer().write(byteString, 0, Math.min(byteString.size(), 64)));
    }
}

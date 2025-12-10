package androidx.compose.p003ui.text.android;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, m29142d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/text/CharacterIterator;", "", "charSequence", "", "start", "end", "<init>", "(Ljava/lang/CharSequence;II)V", "", "first", "()C", "last", "current", "next", "previous", "position", "setIndex", "(I)C", "getBeginIndex", "()I", "getEndIndex", "getIndex", "", "clone", "()Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/CharSequence;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, "d", FirebaseAnalytics.Param.INDEX, "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.CharSequenceCharacterIterator */
/* loaded from: classes2.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {

    /* renamed from: a */
    public final CharSequence f31205a;

    /* renamed from: b */
    public final int f31206b;

    /* renamed from: c */
    public final int f31207c;

    /* renamed from: d */
    public int f31208d;

    public CharSequenceCharacterIterator(@NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f31205a = charSequence;
        this.f31206b = i;
        this.f31207c = i2;
        this.f31208d = i;
    }

    @Override // java.text.CharacterIterator
    @NotNull
    public Object clone() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNullExpressionValue(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.f31208d;
        if (i == this.f31207c) {
            return CharCompanionObject.MAX_VALUE;
        }
        return this.f31205a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f31208d = this.f31206b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f31206b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f31207c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f31208d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.f31206b;
        int i2 = this.f31207c;
        if (i == i2) {
            this.f31208d = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        int i3 = i2 - 1;
        this.f31208d = i3;
        return this.f31205a.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.f31208d + 1;
        this.f31208d = i;
        int i2 = this.f31207c;
        if (i >= i2) {
            this.f31208d = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        return this.f31205a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.f31208d;
        if (i <= this.f31206b) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.f31208d = i2;
        return this.f31205a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.f31206b;
        if (i <= this.f31207c && i2 <= i) {
            this.f31208d = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
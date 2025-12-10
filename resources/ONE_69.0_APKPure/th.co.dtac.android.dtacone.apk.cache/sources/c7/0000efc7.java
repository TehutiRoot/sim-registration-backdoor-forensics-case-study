package org.apache.commons.p028io.input;

import java.io.Reader;
import java.util.function.IntPredicate;
import org.apache.commons.p028io.input.CharacterFilterReader;

/* renamed from: org.apache.commons.io.input.CharacterFilterReader */
/* loaded from: classes6.dex */
public class CharacterFilterReader extends AbstractCharacterFilterReader {
    public CharacterFilterReader(Reader reader, final int i) {
        super(reader, new IntPredicate() { // from class: Zo
            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return CharacterFilterReader.m25310g(i, i2);
            }
        });
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m25310g(int i, int i2) {
        return m25309i(i, i2);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m25309i(int i, int i2) {
        return i2 == i;
    }

    public CharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader, intPredicate);
    }
}
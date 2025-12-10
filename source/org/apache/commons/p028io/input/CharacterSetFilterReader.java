package org.apache.commons.p028io.input;

import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;
import org.apache.commons.p028io.input.CharacterSetFilterReader;

/* renamed from: org.apache.commons.io.input.CharacterSetFilterReader */
/* loaded from: classes6.dex */
public class CharacterSetFilterReader extends AbstractCharacterFilterReader {
    public CharacterSetFilterReader(Reader reader, Integer... numArr) {
        this(reader, new HashSet(Arrays.asList(numArr)));
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m25118g(Set set, int i) {
        return m25117i(set, i);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m25117i(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    /* renamed from: j */
    public static IntPredicate m25116j(Set set) {
        if (set == null) {
            return AbstractCharacterFilterReader.SKIP_NONE;
        }
        final Set unmodifiableSet = Collections.unmodifiableSet(set);
        return new IntPredicate() { // from class: ap
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return CharacterSetFilterReader.m25118g(unmodifiableSet, i);
            }
        };
    }

    public CharacterSetFilterReader(Reader reader, Set<Integer> set) {
        super(reader, m25116j(set));
    }
}

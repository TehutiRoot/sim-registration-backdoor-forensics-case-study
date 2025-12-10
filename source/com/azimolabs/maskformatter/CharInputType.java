package com.azimolabs.maskformatter;

import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes3.dex */
public class CharInputType {
    public static int getKeyboardTypeForNextChar(char c) {
        if (Character.isDigit(c) || c == 'X') {
            return 2;
        }
        if (c != '%' && c != 'A' && c != 'Z') {
            if (c == 'd') {
                return 2;
            }
            return 1;
        }
        return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
    }
}

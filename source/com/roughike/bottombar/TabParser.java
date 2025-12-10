package com.roughike.bottombar;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.roughike.bottombar.BottomBarTab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class TabParser {

    /* renamed from: a */
    public final Context f59035a;

    /* renamed from: b */
    public final BottomBarTab.Config f59036b;

    /* renamed from: c */
    public final XmlResourceParser f59037c;

    /* renamed from: d */
    public List f59038d = null;

    /* loaded from: classes5.dex */
    public static class TabParserException extends RuntimeException {
    }

    public TabParser(Context context, BottomBarTab.Config config, int i) {
        this.f59035a = context;
        this.f59036b = config;
        this.f59037c = context.getResources().getXml(i);
    }

    /* renamed from: a */
    public final int m33234a(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0) {
            try {
                return Color.parseColor(xmlResourceParser.getAttributeValue(i));
            } catch (Exception unused) {
                return -1;
            }
        }
        return ContextCompat.getColor(this.f59035a, attributeResourceValue);
    }

    /* renamed from: b */
    public final String m33233b(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0) {
            return xmlResourceParser.getAttributeValue(i);
        }
        return this.f59035a.getString(attributeResourceValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public final BottomBarTab m33232c(XmlResourceParser xmlResourceParser, int i) {
        char c;
        BottomBarTab m33230e = m33230e();
        m33230e.setIndexInContainer(i);
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1765033179:
                    if (attributeName.equals("barColorWhenSelected")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1077332995:
                    if (attributeName.equals("activeColor")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -738071611:
                    if (attributeName.equals("iconOnly")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -424740686:
                    if (attributeName.equals("badgeBackgroundColor")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3226745:
                    if (attributeName.equals("icon")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 110371416:
                    if (attributeName.equals(MessageBundle.TITLE_ENTRY)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1110315790:
                    if (attributeName.equals("badgeHidesWhenActive")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1162188184:
                    if (attributeName.equals("inActiveColor")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    int m33234a = m33234a(xmlResourceParser, i2);
                    if (m33234a == -1) {
                        break;
                    } else {
                        m33230e.setBarColorWhenSelected(m33234a);
                        break;
                    }
                case 1:
                    int m33234a2 = m33234a(xmlResourceParser, i2);
                    if (m33234a2 == -1) {
                        break;
                    } else {
                        m33230e.setActiveColor(m33234a2);
                        break;
                    }
                case 2:
                    m33230e.setIsTitleless(xmlResourceParser.getAttributeBooleanValue(i2, false));
                    break;
                case 3:
                    int m33234a3 = m33234a(xmlResourceParser, i2);
                    if (m33234a3 == -1) {
                        break;
                    } else {
                        m33230e.setBadgeBackgroundColor(m33234a3);
                        break;
                    }
                case 4:
                    m33230e.setId(xmlResourceParser.getIdAttributeResourceValue(i2));
                    break;
                case 5:
                    m33230e.setIconResId(xmlResourceParser.getAttributeResourceValue(i2, 0));
                    break;
                case 6:
                    m33230e.setTitle(m33233b(xmlResourceParser, i2));
                    break;
                case 7:
                    m33230e.setBadgeHidesWhenActive(xmlResourceParser.getAttributeBooleanValue(i2, true));
                    break;
                case '\b':
                    int m33234a4 = m33234a(xmlResourceParser, i2);
                    if (m33234a4 == -1) {
                        break;
                    } else {
                        m33230e.setInActiveColor(m33234a4);
                        break;
                    }
            }
        }
        return m33230e;
    }

    /* renamed from: d */
    public List m33231d() {
        int next;
        if (this.f59038d == null) {
            this.f59038d = new ArrayList(5);
            do {
                try {
                    next = this.f59037c.next();
                    if (next == 2 && "tab".equals(this.f59037c.getName())) {
                        this.f59038d.add(m33232c(this.f59037c, this.f59038d.size()));
                    }
                } catch (IOException | XmlPullParserException e) {
                    e.printStackTrace();
                    throw new TabParserException();
                }
            } while (next != 1);
            return this.f59038d;
        }
        return this.f59038d;
    }

    /* renamed from: e */
    public final BottomBarTab m33230e() {
        BottomBarTab bottomBarTab = new BottomBarTab(this.f59035a);
        bottomBarTab.setConfig(this.f59036b);
        return bottomBarTab;
    }
}

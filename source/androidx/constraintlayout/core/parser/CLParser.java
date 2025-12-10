package androidx.constraintlayout.core.parser;

import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes2.dex */
public class CLParser {

    /* renamed from: d */
    public static boolean f32300d = false;

    /* renamed from: a */
    public String f32301a;

    /* renamed from: b */
    public boolean f32302b = false;

    /* renamed from: c */
    public int f32303c;

    /* loaded from: classes2.dex */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3686a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32304a;

        static {
            int[] iArr = new int[TYPE.values().length];
            f32304a = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32304a[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32304a[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32304a[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32304a[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32304a[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CLParser(String str) {
        this.f32301a = str;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    /* renamed from: a */
    public final CLElement m58697a(CLElement cLElement, int i, TYPE type, boolean z, char[] cArr) {
        CLElement allocate;
        if (f32300d) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (C3686a.f32304a[type.ordinal()]) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                allocate = CLString.allocate(cArr);
                break;
            case 4:
                allocate = CLNumber.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.f32303c);
        if (z) {
            allocate.setStart(i);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    /* renamed from: b */
    public final CLElement m58696b(int i, char c, CLElement cLElement, char[] cArr) {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c != '\"' && c != '\'') {
                if (c != '[') {
                    if (c != ']') {
                        if (c != '{') {
                            if (c != '}') {
                                switch (c) {
                                    case '+':
                                    case '-':
                                    case '.':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case EACTags.TRANSACTION_DATE /* 51 */:
                                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                    case EACTags.SEX /* 53 */:
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        return m58697a(cLElement, i, TYPE.NUMBER, true, cArr);
                                    case ',':
                                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                        return cLElement;
                                    case '/':
                                        int i2 = i + 1;
                                        if (i2 < cArr.length && cArr[i2] == '/') {
                                            this.f32302b = true;
                                            return cLElement;
                                        }
                                        return cLElement;
                                    default:
                                        if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                                            CLElement m58697a = m58697a(cLElement, i, TYPE.TOKEN, true, cArr);
                                            CLToken cLToken = (CLToken) m58697a;
                                            if (!cLToken.validate(c, i)) {
                                                throw new CLParsingException("incorrect token <" + c + "> at line " + this.f32303c, cLToken);
                                            }
                                            return m58697a;
                                        }
                                        return m58697a(cLElement, i, TYPE.KEY, true, cArr);
                                }
                            }
                        } else {
                            return m58697a(cLElement, i, TYPE.OBJECT, true, cArr);
                        }
                    }
                    cLElement.setEnd(i - 1);
                    CLElement container = cLElement.getContainer();
                    container.setEnd(i);
                    return container;
                }
                return m58697a(cLElement, i, TYPE.ARRAY, true, cArr);
            } else if (cLElement instanceof CLObject) {
                return m58697a(cLElement, i, TYPE.KEY, true, cArr);
            } else {
                return m58697a(cLElement, i, TYPE.STRING, true, cArr);
            }
        }
        return cLElement;
    }

    public CLObject parse() throws CLParsingException {
        char[] charArray = this.f32301a.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.f32303c = 1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c = charArray[i2];
            if (c == '{') {
                break;
            }
            if (c == '\n') {
                this.f32303c++;
            }
            i2++;
        }
        if (i2 != -1) {
            CLObject allocate = CLObject.allocate(charArray);
            allocate.setLine(this.f32303c);
            allocate.setStart(i2);
            int i3 = i2 + 1;
            CLObject cLObject = allocate;
            while (i3 < length) {
                char c2 = charArray[i3];
                if (c2 == '\n') {
                    this.f32303c += i;
                }
                if (this.f32302b) {
                    if (c2 == '\n') {
                        this.f32302b = z;
                    } else {
                        continue;
                        i3++;
                        i = 1;
                        z = false;
                    }
                }
                if (cLObject == null) {
                    break;
                }
                if (cLObject.isDone()) {
                    cLObject = m58696b(i3, c2, cLObject, charArray);
                } else if (cLObject instanceof CLObject) {
                    if (c2 == '}') {
                        cLObject.setEnd(i3 - 1);
                    } else {
                        cLObject = m58696b(i3, c2, cLObject, charArray);
                    }
                } else if (!(cLObject instanceof CLArray)) {
                    boolean z2 = cLObject instanceof CLString;
                    if (z2) {
                        long j = cLObject.start;
                        if (charArray[(int) j] == c2) {
                            cLObject.setStart(j + 1);
                            cLObject.setEnd(i3 - 1);
                        }
                    } else {
                        if (cLObject instanceof CLToken) {
                            CLToken cLToken = (CLToken) cLObject;
                            if (!cLToken.validate(c2, i3)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.f32303c, cLToken);
                            }
                        }
                        if ((cLObject instanceof CLKey) || z2) {
                            long j2 = cLObject.start;
                            char c3 = charArray[(int) j2];
                            if ((c3 == '\'' || c3 == '\"') && c3 == c2) {
                                cLObject.setStart(j2 + 1);
                                cLObject.setEnd(i3 - 1);
                            }
                        }
                        if (!cLObject.isDone() && (c2 == '}' || c2 == ']' || c2 == ',' || c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n' || c2 == ':')) {
                            long j3 = i3 - 1;
                            cLObject.setEnd(j3);
                            if (c2 == '}' || c2 == ']') {
                                cLObject = cLObject.getContainer();
                                cLObject.setEnd(j3);
                                if (cLObject instanceof CLKey) {
                                    cLObject = cLObject.getContainer();
                                    cLObject.setEnd(j3);
                                }
                            }
                        }
                    }
                } else if (c2 == ']') {
                    cLObject.setEnd(i3 - 1);
                } else {
                    cLObject = m58696b(i3, c2, cLObject, charArray);
                }
                if (cLObject.isDone() && (!(cLObject instanceof CLKey) || ((CLKey) cLObject).f32292c.size() > 0)) {
                    cLObject = cLObject.getContainer();
                }
                i3++;
                i = 1;
                z = false;
            }
            while (cLObject != null && !cLObject.isDone()) {
                if (cLObject instanceof CLString) {
                    cLObject.setStart(((int) cLObject.start) + 1);
                }
                cLObject.setEnd(length - 1);
                cLObject = cLObject.getContainer();
            }
            if (f32300d) {
                System.out.println("Root: " + allocate.toJSON());
            }
            return allocate;
        }
        throw new CLParsingException("invalid json content", null);
    }
}

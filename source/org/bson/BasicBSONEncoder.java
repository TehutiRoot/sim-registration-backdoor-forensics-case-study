package org.bson;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.bson.AbstractBsonWriter;
import org.bson.p044io.BasicOutputBuffer;
import org.bson.p044io.OutputBuffer;
import org.bson.types.BSONTimestamp;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWScope;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;
import org.bson.types.Symbol;

/* loaded from: classes6.dex */
public class BasicBSONEncoder implements BSONEncoder {

    /* renamed from: a */
    public BsonBinaryWriter f75718a;

    /* renamed from: b */
    public OutputBuffer f75719b;

    /* renamed from: b */
    public static void m24345b(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public void _putObjectField(String str, Object obj) {
        if ("_transientFields".equals(str)) {
            return;
        }
        if (!str.contains("\u0000")) {
            if ("$where".equals(str) && (obj instanceof String)) {
                putCode(str, new Code((String) obj));
            }
            Object applyEncodingHooks = BSON.applyEncodingHooks(obj);
            if (applyEncodingHooks == null) {
                putNull(str);
                return;
            } else if (applyEncodingHooks instanceof Date) {
                putDate(str, (Date) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Decimal128) {
                putDecimal128(str, (Decimal128) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Number) {
                putNumber(str, (Number) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Character) {
                putString(str, applyEncodingHooks.toString());
                return;
            } else if (applyEncodingHooks instanceof String) {
                putString(str, applyEncodingHooks.toString());
                return;
            } else if (applyEncodingHooks instanceof ObjectId) {
                putObjectId(str, (ObjectId) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Boolean) {
                putBoolean(str, (Boolean) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Pattern) {
                putPattern(str, (Pattern) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Iterable) {
                putIterable(str, (Iterable) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof BSONObject) {
                putObject(str, (BSONObject) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Map) {
                putMap(str, (Map) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof byte[]) {
                putBinary(str, (byte[]) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Binary) {
                putBinary(str, (Binary) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof UUID) {
                putUUID(str, (UUID) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks.getClass().isArray()) {
                putArray(str, applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Symbol) {
                putSymbol(str, (Symbol) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof BSONTimestamp) {
                putTimestamp(str, (BSONTimestamp) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof CodeWScope) {
                putCodeWScope(str, (CodeWScope) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof Code) {
                putCode(str, (Code) applyEncodingHooks);
                return;
            } else if (applyEncodingHooks instanceof MinKey) {
                putMinKey(str);
                return;
            } else if (applyEncodingHooks instanceof MaxKey) {
                putMaxKey(str);
                return;
            } else if (putSpecial(str, applyEncodingHooks)) {
                return;
            } else {
                throw new IllegalArgumentException("Can't serialize " + applyEncodingHooks.getClass());
            }
        }
        throw new IllegalArgumentException("Document field names can't have a NULL character. (Bad Key: '" + str + "')");
    }

    /* renamed from: a */
    public final boolean m24346a() {
        if (this.f75718a.getContext().getParentContext() == null) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BSONEncoder
    public void done() {
        this.f75718a.close();
        this.f75718a = null;
    }

    @Override // org.bson.BSONEncoder
    public byte[] encode(BSONObject bSONObject) {
        BasicOutputBuffer basicOutputBuffer = new BasicOutputBuffer();
        set(basicOutputBuffer);
        putObject(bSONObject);
        done();
        return basicOutputBuffer.toByteArray();
    }

    public BsonBinaryWriter getBsonWriter() {
        return this.f75718a;
    }

    public OutputBuffer getOutputBuffer() {
        return this.f75719b;
    }

    public void putArray(String str, Object obj) {
        putName(str);
        this.f75718a.writeStartArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                this.f75718a.writeInt32(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                this.f75718a.writeInt64(jArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length;
            while (i < length3) {
                this.f75718a.writeDouble(fArr[i]);
                i++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length4 = sArr.length;
            while (i < length4) {
                this.f75718a.writeInt32(sArr[i]);
                i++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            while (i < length5) {
                this.f75718a.writeInt32(bArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i < length6) {
                this.f75718a.writeDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length7 = zArr.length;
            while (i < length7) {
                this.f75718a.writeBoolean(zArr[i]);
                i++;
            }
        } else if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length8 = strArr.length;
            while (i < length8) {
                this.f75718a.writeString(strArr[i]);
                i++;
            }
        } else {
            int length9 = Array.getLength(obj);
            while (i < length9) {
                _putObjectField(String.valueOf(i), Array.get(obj, i));
                i++;
            }
        }
        this.f75718a.writeEndArray();
    }

    public void putBinary(String str, byte[] bArr) {
        putName(str);
        this.f75718a.writeBinaryData(new BsonBinary(bArr));
    }

    public void putBoolean(String str, Boolean bool) {
        putName(str);
        this.f75718a.writeBoolean(bool.booleanValue());
    }

    public void putCode(String str, Code code) {
        putName(str);
        this.f75718a.writeJavaScript(code.getCode());
    }

    public void putCodeWScope(String str, CodeWScope codeWScope) {
        putName(str);
        this.f75718a.writeJavaScriptWithScope(codeWScope.getCode());
        putObject(codeWScope.getScope());
    }

    public void putDate(String str, Date date) {
        putName(str);
        this.f75718a.writeDateTime(date.getTime());
    }

    public void putDecimal128(String str, Decimal128 decimal128) {
        putName(str);
        this.f75718a.writeDecimal128(decimal128);
    }

    public void putIterable(String str, Iterable iterable) {
        putName(str);
        this.f75718a.writeStartArray();
        for (Object obj : iterable) {
            _putObjectField(String.valueOf(0), obj);
        }
        this.f75718a.writeEndArray();
    }

    public void putMap(String str, Map map) {
        putName(str);
        this.f75718a.writeStartDocument();
        for (Map.Entry entry : map.entrySet()) {
            _putObjectField((String) entry.getKey(), entry.getValue());
        }
        this.f75718a.writeEndDocument();
    }

    public void putMaxKey(String str) {
        putName(str);
        this.f75718a.writeMaxKey();
    }

    public void putMinKey(String str) {
        putName(str);
        this.f75718a.writeMinKey();
    }

    public void putName(String str) {
        if (this.f75718a.getState() == AbstractBsonWriter.State.NAME) {
            this.f75718a.writeName(str);
        }
    }

    public void putNull(String str) {
        putName(str);
        this.f75718a.writeNull();
    }

    public void putNumber(String str, Number number) {
        putName(str);
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte) && !(number instanceof AtomicInteger)) {
            if (!(number instanceof Long) && !(number instanceof AtomicLong)) {
                if (!(number instanceof Float) && !(number instanceof Double)) {
                    throw new IllegalArgumentException("Can't serialize " + number.getClass());
                }
                this.f75718a.writeDouble(number.doubleValue());
                return;
            }
            this.f75718a.writeInt64(number.longValue());
            return;
        }
        this.f75718a.writeInt32(number.intValue());
    }

    @Override // org.bson.BSONEncoder
    public int putObject(BSONObject bSONObject) {
        int position = getOutputBuffer().getPosition();
        this.f75718a.writeStartDocument();
        if (m24346a() && bSONObject.containsField("_id")) {
            _putObjectField("_id", bSONObject.get("_id"));
        }
        for (String str : bSONObject.keySet()) {
            if (!m24346a() || !str.equals("_id")) {
                _putObjectField(str, bSONObject.get(str));
            }
        }
        this.f75718a.writeEndDocument();
        return getOutputBuffer().getPosition() - position;
    }

    public void putObjectId(String str, ObjectId objectId) {
        putName(str);
        this.f75718a.writeObjectId(objectId);
    }

    public void putPattern(String str, Pattern pattern) {
        putName(str);
        this.f75718a.writeRegularExpression(new BsonRegularExpression(pattern.pattern(), BSON.regexFlags(pattern.flags())));
    }

    public boolean putSpecial(String str, Object obj) {
        return false;
    }

    public void putString(String str, String str2) {
        putName(str);
        this.f75718a.writeString(str2);
    }

    public void putSymbol(String str, Symbol symbol) {
        putName(str);
        this.f75718a.writeSymbol(symbol.getSymbol());
    }

    public void putTimestamp(String str, BSONTimestamp bSONTimestamp) {
        putName(str);
        this.f75718a.writeTimestamp(new BsonTimestamp(bSONTimestamp.getTime(), bSONTimestamp.getInc()));
    }

    public void putUUID(String str, UUID uuid) {
        putName(str);
        byte[] bArr = new byte[16];
        m24345b(bArr, 0, uuid.getMostSignificantBits());
        m24345b(bArr, 8, uuid.getLeastSignificantBits());
        this.f75718a.writeBinaryData(new BsonBinary(BsonBinarySubType.UUID_LEGACY, bArr));
    }

    public void putUndefined(String str) {
        putName(str);
        this.f75718a.writeUndefined();
    }

    @Override // org.bson.BSONEncoder
    public void set(OutputBuffer outputBuffer) {
        if (this.f75718a == null) {
            this.f75719b = outputBuffer;
            this.f75718a = new BsonBinaryWriter(outputBuffer);
            return;
        }
        throw new IllegalStateException("Performing another operation at this moment");
    }

    public void putBinary(String str, Binary binary) {
        putName(str);
        this.f75718a.writeBinaryData(new BsonBinary(binary.getType(), binary.getData()));
    }

    public int putObject(String str, BSONObject bSONObject) {
        putName(str);
        return putObject(bSONObject);
    }
}

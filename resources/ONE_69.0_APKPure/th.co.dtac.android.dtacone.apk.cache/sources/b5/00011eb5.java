package th.p047co.dtac.android.dtacone.model.mnp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;
import th.p047co.dtac.android.dtacone.model.upPass.QueryResultData;
import th.p047co.dtac.android.dtacone.util.Constant;

/* renamed from: th.co.dtac.android.dtacone.model.mnp.IdCardInformationCollection */
/* loaded from: classes8.dex */
public class IdCardInformationCollection implements Parcelable {
    public static final Parcelable.Creator<IdCardInformationCollection> CREATOR = new C14228a();
    private String birthday;
    private String bp1Number;
    private String cardNo;
    private String district;
    private String expire;
    private String firstNameEN;
    private String firstNameTH;
    private String gender;
    private String houseNo;
    private String idCard;
    private String issue;
    private String laserCode;
    private String middleNameEN;
    private String middleNameTH;
    private String moo;
    private byte[] picture;
    private String pictureId;
    private String postcode;
    private Long postcodeSeq;
    private String prefixEN;
    private String prefixTH;
    private String province;
    private String road;
    private String soi;
    private String subDistrict;
    private String surnameEN;
    private String surnameTH;

    /* renamed from: th.co.dtac.android.dtacone.model.mnp.IdCardInformationCollection$a */
    /* loaded from: classes8.dex */
    public class C14228a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IdCardInformationCollection createFromParcel(Parcel parcel) {
            return new IdCardInformationCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IdCardInformationCollection[] newArray(int i) {
            return new IdCardInformationCollection[i];
        }
    }

    public IdCardInformationCollection(Parcel parcel) {
        this.idCard = parcel.readString();
        this.prefixTH = parcel.readString();
        this.firstNameTH = parcel.readString();
        this.middleNameTH = parcel.readString();
        this.surnameTH = parcel.readString();
        this.prefixEN = parcel.readString();
        this.firstNameEN = parcel.readString();
        this.middleNameEN = parcel.readString();
        this.surnameEN = parcel.readString();
        this.gender = parcel.readString();
        this.birthday = parcel.readString();
        this.houseNo = parcel.readString();
        this.moo = parcel.readString();
        this.road = parcel.readString();
        this.soi = parcel.readString();
        this.subDistrict = parcel.readString();
        this.district = parcel.readString();
        this.province = parcel.readString();
        this.issue = parcel.readString();
        this.expire = parcel.readString();
        this.pictureId = parcel.readString();
        this.picture = parcel.createByteArray();
        this.postcode = parcel.readString();
        this.bp1Number = parcel.readString();
        this.cardNo = parcel.readString();
        this.laserCode = parcel.readString();
    }

    /* renamed from: a */
    public String m19297a(String str) {
        if (str.length() == 8) {
            String substring = str.substring(4, 6);
            String substring2 = str.substring(6);
            String substring3 = str.substring(0, 4);
            if (substring2.equals("00")) {
                substring2 = "01";
            }
            if (substring.equals("00")) {
                substring = "01";
            }
            return substring3 + substring + substring2;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return (this.houseNo + TokenParser.f74644SP + this.moo + TokenParser.f74644SP + this.road + TokenParser.f74644SP + this.soi + TokenParser.f74644SP + this.subDistrict).replaceAll("\\s+", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public String getAddress1() {
        return (this.houseNo + TokenParser.f74644SP + this.moo + TokenParser.f74644SP + this.road + TokenParser.f74644SP + this.soi).replaceAll("\\s+", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public String getAddress2() {
        return (this.subDistrict).replaceAll("\\s+", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getBp1Number() {
        return this.bp1Number;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getExpire() {
        return this.expire;
    }

    public String getFirstNameEN() {
        return this.firstNameEN;
    }

    public String getFirstNameTH() {
        return this.firstNameTH;
    }

    public String getGender() {
        return this.gender;
    }

    public String getHouseNo() {
        return this.houseNo;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public String getIssue() {
        return this.issue;
    }

    public String getLaserCode() {
        return this.laserCode;
    }

    public String getMiddleNameEN() {
        return this.middleNameEN;
    }

    public String getMiddleNameTH() {
        return this.middleNameTH;
    }

    public String getMoo() {
        return this.moo;
    }

    public String getNameEng() {
        return (this.prefixEN + TokenParser.f74644SP + this.firstNameEN + TokenParser.f74644SP + this.middleNameEN + TokenParser.f74644SP + this.surnameEN).replaceAll("\\s+", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public String getNameThai() {
        return (this.prefixTH + TokenParser.f74644SP + this.firstNameTH + TokenParser.f74644SP + this.middleNameTH + TokenParser.f74644SP + this.surnameTH).replaceAll("\\s+", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public byte[] getPicture() {
        return this.picture;
    }

    public String getPictureId() {
        return this.pictureId;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public Long getPostcodeSeq() {
        return this.postcodeSeq;
    }

    public String getPrefixEN() {
        return this.prefixEN;
    }

    public String getPrefixTH() {
        return this.prefixTH;
    }

    public String getProvince() {
        return this.province;
    }

    public String getRoad() {
        return this.road;
    }

    public String getSoi() {
        return this.soi;
    }

    public String getSubDistrict() {
        return this.subDistrict;
    }

    public String getSurnameEN() {
        return this.surnameEN;
    }

    public String getSurnameTH() {
        return this.surnameTH;
    }

    public void setIdCard(String str) {
        this.idCard = str;
    }

    public void setPostCodeFromApi(String str) {
        this.postcode = str;
    }

    public void setPostcodeSeqFromApi(Long l) {
        this.postcodeSeq = l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.idCard);
        parcel.writeString(this.prefixTH);
        parcel.writeString(this.firstNameTH);
        parcel.writeString(this.middleNameTH);
        parcel.writeString(this.surnameTH);
        parcel.writeString(this.prefixEN);
        parcel.writeString(this.firstNameEN);
        parcel.writeString(this.middleNameEN);
        parcel.writeString(this.surnameEN);
        parcel.writeString(this.gender);
        parcel.writeString(this.birthday);
        parcel.writeString(this.houseNo);
        parcel.writeString(this.moo);
        parcel.writeString(this.road);
        parcel.writeString(this.soi);
        parcel.writeString(this.subDistrict);
        parcel.writeString(this.district);
        parcel.writeString(this.province);
        parcel.writeString(this.issue);
        parcel.writeString(this.expire);
        parcel.writeString(this.pictureId);
        parcel.writeByteArray(this.picture);
        parcel.writeString(this.postcode);
        parcel.writeString(this.bp1Number);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.laserCode);
    }

    public IdCardInformationCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, String str9, String str10, String str11) {
        this.idCard = str;
        String[] split = str2.trim().split("#");
        this.prefixTH = split[0];
        this.firstNameTH = split[1];
        this.middleNameTH = split[2];
        this.surnameTH = split[3];
        String[] split2 = str3.trim().split("#");
        this.prefixEN = split2[0];
        this.firstNameEN = split2[1];
        this.middleNameEN = split2[2];
        this.surnameEN = split2[3];
        this.gender = str4;
        this.birthday = m19297a(str5);
        String[] split3 = str6.trim().split("#");
        this.houseNo = split3[0];
        this.moo = split3[1] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + split3[2];
        this.soi = split3[3];
        this.road = split3[4];
        this.subDistrict = split3[5];
        this.district = split3[6];
        this.province = split3[7];
        if (str7.length() < 8) {
            this.issue = Constant.DEFAULT_ISSUE_DATE;
            this.expire = Constant.SMART_CARD_EXPIRE_DATE;
        } else if (str7.length() >= 8 && str7.length() < 16) {
            this.issue = str7.substring(0, 8);
            this.expire = Constant.SMART_CARD_EXPIRE_DATE;
        } else {
            this.issue = str7.substring(0, 8);
            this.expire = str7.substring(8, 16);
        }
        this.pictureId = str8;
        this.picture = bArr;
        this.bp1Number = str9;
        this.cardNo = str10;
        this.laserCode = str11;
    }

    public IdCardInformationCollection(QueryResultData queryResultData) {
        this.idCard = queryResultData.getReadDocumentNumber();
        this.prefixTH = queryResultData.getReadNamePrefix();
        this.firstNameTH = queryResultData.getReadFullNameFirstName();
        this.surnameTH = queryResultData.getReadFullNameLastName();
        this.firstNameEN = queryResultData.getReadFullNameEnFirstName();
        this.surnameEN = queryResultData.getReadFullNameEnLastName();
        String readGender = queryResultData.getReadGender();
        if (readGender != null) {
            String upperCase = readGender.toUpperCase();
            upperCase.hashCode();
            if (upperCase.equals("MALE")) {
                this.gender = "M";
            } else if (upperCase.equals("FEMALE")) {
                this.gender = "F";
            }
        }
        String readDateOfBirth = queryResultData.getReadDateOfBirth();
        if (readDateOfBirth != null) {
            this.birthday = m19297a(readDateOfBirth);
        }
        this.houseNo = queryResultData.getReadHomeAddressNumber();
        this.subDistrict = queryResultData.getReadHomeAddressSubdistrict();
        this.district = queryResultData.getReadHomeAddressDistrict();
        this.province = queryResultData.getReadHomeAddressProvince();
        this.issue = queryResultData.getReadDateOfIssue();
        this.expire = queryResultData.getReadDateOfExpiry();
        if (queryResultData.getReadDocumentImage() == null || queryResultData.getReadDocumentImage().isEmpty()) {
            return;
        }
        String[] split = queryResultData.getReadDocumentImage().split(",");
        this.picture = Base64.decode(split[split.length - 1], 0);
    }

    public IdCardInformationCollection() {
    }

    public IdCardInformationCollection(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        this.idCard = str;
        this.firstNameTH = str2;
        this.surnameTH = str3;
        this.birthday = str4;
        this.houseNo = str5;
        this.picture = bArr;
    }

    public IdCardInformationCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, byte[] bArr) {
        this.idCard = str;
        this.firstNameTH = str2;
        this.surnameTH = str3;
        this.birthday = str4;
        this.gender = str5;
        this.houseNo = str6;
        this.subDistrict = str7;
        this.district = str8;
        this.province = str9;
        this.picture = bArr;
    }
}
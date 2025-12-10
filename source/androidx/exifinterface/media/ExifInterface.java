package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.AbstractC4559a;
import ch.qos.logback.core.net.SyslogConstants;
import coil.util.Utils;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.fontbox.ttf.WGL4Names;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes2.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;

    /* renamed from: R */
    public static SimpleDateFormat f35308R = null;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;

    /* renamed from: S */
    public static SimpleDateFormat f35309S = null;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";

    /* renamed from: W */
    public static final C4556e[] f35313W;
    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;
    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;

    /* renamed from: X */
    public static final C4556e[] f35314X;

    /* renamed from: Y */
    public static final C4556e[] f35315Y;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;

    /* renamed from: Z */
    public static final C4556e[] f35316Z;

    /* renamed from: a0 */
    public static final C4556e[] f35317a0;

    /* renamed from: b0 */
    public static final C4556e f35318b0;

    /* renamed from: c0 */
    public static final C4556e[] f35319c0;

    /* renamed from: d0 */
    public static final C4556e[] f35320d0;

    /* renamed from: e0 */
    public static final C4556e[] f35321e0;

    /* renamed from: f0 */
    public static final C4556e[] f35322f0;

    /* renamed from: g0 */
    public static final C4556e[][] f35323g0;

    /* renamed from: h0 */
    public static final C4556e[] f35324h0;

    /* renamed from: i0 */
    public static final HashMap[] f35325i0;

    /* renamed from: j0 */
    public static final HashMap[] f35326j0;

    /* renamed from: k0 */
    public static final HashSet f35327k0;

    /* renamed from: l0 */
    public static final HashMap f35328l0;

    /* renamed from: m0 */
    public static final Charset f35329m0;

    /* renamed from: n0 */
    public static final byte[] f35330n0;

    /* renamed from: o0 */
    public static final byte[] f35331o0;

    /* renamed from: p0 */
    public static final Pattern f35332p0;

    /* renamed from: q0 */
    public static final Pattern f35333q0;

    /* renamed from: r0 */
    public static final Pattern f35334r0;

    /* renamed from: s0 */
    public static final Pattern f35335s0;

    /* renamed from: a */
    public String f35341a;

    /* renamed from: b */
    public FileDescriptor f35342b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f35343c;

    /* renamed from: d */
    public int f35344d;

    /* renamed from: e */
    public boolean f35345e;

    /* renamed from: f */
    public final HashMap[] f35346f;

    /* renamed from: g */
    public Set f35347g;

    /* renamed from: h */
    public ByteOrder f35348h;

    /* renamed from: i */
    public boolean f35349i;

    /* renamed from: j */
    public boolean f35350j;

    /* renamed from: k */
    public boolean f35351k;

    /* renamed from: l */
    public int f35352l;

    /* renamed from: m */
    public int f35353m;

    /* renamed from: n */
    public byte[] f35354n;

    /* renamed from: o */
    public int f35355o;

    /* renamed from: p */
    public int f35356p;

    /* renamed from: q */
    public int f35357q;

    /* renamed from: r */
    public int f35358r;

    /* renamed from: s */
    public int f35359s;

    /* renamed from: t */
    public boolean f35360t;

    /* renamed from: u */
    public boolean f35361u;

    /* renamed from: v */
    public static final boolean f35336v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    public static final List f35337w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    public static final List f35338x = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};

    /* renamed from: y */
    public static final byte[] f35339y = {-1, -40, -1};

    /* renamed from: z */
    public static final byte[] f35340z = {102, 116, 121, 112};

    /* renamed from: A */
    public static final byte[] f35291A = {109, 105, 102, Framer.STDOUT_FRAME_PREFIX};

    /* renamed from: B */
    public static final byte[] f35292B = {104, 101, 105, 99};

    /* renamed from: C */
    public static final byte[] f35293C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D */
    public static final byte[] f35294D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E */
    public static final byte[] f35295E = {-119, 80, 78, 71, 13, 10, Ascii.SUB, 10};

    /* renamed from: F */
    public static final byte[] f35296F = {101, 88, 73, 102};

    /* renamed from: G */
    public static final byte[] f35297G = {73, 72, 68, 82};

    /* renamed from: H */
    public static final byte[] f35298H = {73, 69, 78, 68};

    /* renamed from: I */
    public static final byte[] f35299I = {82, 73, 70, 70};

    /* renamed from: J */
    public static final byte[] f35300J = {87, 69, 66, 80};

    /* renamed from: K */
    public static final byte[] f35301K = {69, 88, 73, 70};

    /* renamed from: L */
    public static final byte[] f35302L = {-99, 1, 42};

    /* renamed from: M */
    public static final byte[] f35303M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N */
    public static final byte[] f35304N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O */
    public static final byte[] f35305O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P */
    public static final byte[] f35306P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f35307Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    public static final String[] f35310T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: U */
    public static final int[] f35311U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: V */
    public static final byte[] f35312V = {65, 83, 67, 73, 73, 0, 0, 0};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface IfdType {
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$a */
    /* loaded from: classes2.dex */
    public class C4552a extends MediaDataSource {

        /* renamed from: a */
        public long f35362a;

        /* renamed from: b */
        public final /* synthetic */ C4558g f35363b;

        public C4552a(C4558g c4558g) {
            this.f35363b = c4558g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f35362a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f35363b.available()) {
                        return -1;
                    }
                    this.f35363b.seek(j);
                    this.f35362a = j;
                }
                if (i2 > this.f35363b.available()) {
                    i2 = this.f35363b.available();
                }
                int read = this.f35363b.read(bArr, i, i2);
                if (read >= 0) {
                    this.f35362a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f35362a = -1L;
            return -1;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$c */
    /* loaded from: classes2.dex */
    public static class C4554c extends FilterOutputStream {

        /* renamed from: a */
        public final OutputStream f35370a;

        /* renamed from: b */
        public ByteOrder f35371b;

        public C4554c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f35370a = outputStream;
            this.f35371b = byteOrder;
        }

        /* renamed from: b */
        public void m54550b(ByteOrder byteOrder) {
            this.f35371b = byteOrder;
        }

        /* renamed from: d */
        public void m54549d(int i) {
            ByteOrder byteOrder = this.f35371b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f35370a.write(i & 255);
                this.f35370a.write((i >>> 8) & 255);
                this.f35370a.write((i >>> 16) & 255);
                this.f35370a.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f35370a.write((i >>> 24) & 255);
                this.f35370a.write((i >>> 16) & 255);
                this.f35370a.write((i >>> 8) & 255);
                this.f35370a.write(i & 255);
            }
        }

        /* renamed from: g */
        public void m54548g(short s) {
            ByteOrder byteOrder = this.f35371b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f35370a.write(s & 255);
                this.f35370a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f35370a.write((s >>> 8) & 255);
                this.f35370a.write(s & 255);
            }
        }

        /* renamed from: i */
        public void m54547i(long j) {
            if (j <= BodyPartID.bodyIdMax) {
                m54549d((int) j);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }

        /* renamed from: j */
        public void m54546j(int i) {
            if (i <= 65535) {
                m54548g((short) i);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f35370a.write(bArr);
        }

        public void writeByte(int i) {
            this.f35370a.write(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f35370a.write(bArr, i, i2);
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$d */
    /* loaded from: classes2.dex */
    public static class C4555d {

        /* renamed from: a */
        public final int f35372a;

        /* renamed from: b */
        public final int f35373b;

        /* renamed from: c */
        public final long f35374c;

        /* renamed from: d */
        public final byte[] f35375d;

        public C4555d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* renamed from: a */
        public static C4555d m54545a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C4555d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(ExifInterface.f35329m0);
            return new C4555d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C4555d m54544b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f35311U[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new C4555d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static C4555d m54543c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f35311U[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new C4555d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C4555d m54542d(C4557f[] c4557fArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f35311U[10] * c4557fArr.length]);
            wrap.order(byteOrder);
            for (C4557f c4557f : c4557fArr) {
                wrap.putInt((int) c4557f.f35380a);
                wrap.putInt((int) c4557f.f35381b);
            }
            return new C4555d(10, c4557fArr.length, wrap.array());
        }

        /* renamed from: e */
        public static C4555d m54541e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.f35329m0);
            return new C4555d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static C4555d m54540f(long j, ByteOrder byteOrder) {
            return m54539g(new long[]{j}, byteOrder);
        }

        /* renamed from: g */
        public static C4555d m54539g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f35311U[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C4555d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C4555d m54538h(C4557f c4557f, ByteOrder byteOrder) {
            return m54537i(new C4557f[]{c4557f}, byteOrder);
        }

        /* renamed from: i */
        public static C4555d m54537i(C4557f[] c4557fArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f35311U[5] * c4557fArr.length]);
            wrap.order(byteOrder);
            for (C4557f c4557f : c4557fArr) {
                wrap.putInt((int) c4557f.f35380a);
                wrap.putInt((int) c4557f.f35381b);
            }
            return new C4555d(5, c4557fArr.length, wrap.array());
        }

        /* renamed from: j */
        public static C4555d m54536j(int i, ByteOrder byteOrder) {
            return m54535k(new int[]{i}, byteOrder);
        }

        /* renamed from: k */
        public static C4555d m54535k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f35311U[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C4555d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m54534l(ByteOrder byteOrder) {
            Object m54531o = m54531o(byteOrder);
            if (m54531o != null) {
                if (m54531o instanceof String) {
                    return Double.parseDouble((String) m54531o);
                }
                if (m54531o instanceof long[]) {
                    long[] jArr = (long[]) m54531o;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m54531o instanceof int[]) {
                    int[] iArr = (int[]) m54531o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m54531o instanceof double[]) {
                    double[] dArr = (double[]) m54531o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m54531o instanceof C4557f[]) {
                    C4557f[] c4557fArr = (C4557f[]) m54531o;
                    if (c4557fArr.length == 1) {
                        return c4557fArr[0].m54528a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: m */
        public int m54533m(ByteOrder byteOrder) {
            Object m54531o = m54531o(byteOrder);
            if (m54531o != null) {
                if (m54531o instanceof String) {
                    return Integer.parseInt((String) m54531o);
                }
                if (m54531o instanceof long[]) {
                    long[] jArr = (long[]) m54531o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m54531o instanceof int[]) {
                    int[] iArr = (int[]) m54531o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: n */
        public String m54532n(ByteOrder byteOrder) {
            Object m54531o = m54531o(byteOrder);
            if (m54531o == null) {
                return null;
            }
            if (m54531o instanceof String) {
                return (String) m54531o;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (m54531o instanceof long[]) {
                long[] jArr = (long[]) m54531o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m54531o instanceof int[]) {
                int[] iArr = (int[]) m54531o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m54531o instanceof double[]) {
                double[] dArr = (double[]) m54531o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(m54531o instanceof C4557f[])) {
                return null;
            } else {
                C4557f[] c4557fArr = (C4557f[]) m54531o;
                while (i < c4557fArr.length) {
                    sb.append(c4557fArr[i].f35380a);
                    sb.append('/');
                    sb.append(c4557fArr[i].f35381b);
                    i++;
                    if (i != c4557fArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0027: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:14:0x0027 */
        /* JADX WARN: Removed duplicated region for block: B:139:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object m54531o(java.nio.ByteOrder r10) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.C4555d.m54531o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int m54530p() {
            return ExifInterface.f35311U[this.f35372a] * this.f35373b;
        }

        public String toString() {
            return "(" + ExifInterface.f35310T[this.f35372a] + ", data length:" + this.f35375d.length + ")";
        }

        public C4555d(int i, int i2, long j, byte[] bArr) {
            this.f35372a = i;
            this.f35373b = i2;
            this.f35374c = j;
            this.f35375d = bArr;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$f */
    /* loaded from: classes2.dex */
    public static class C4557f {

        /* renamed from: a */
        public final long f35380a;

        /* renamed from: b */
        public final long f35381b;

        public C4557f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        /* renamed from: a */
        public double m54528a() {
            return this.f35380a / this.f35381b;
        }

        public String toString() {
            return this.f35380a + RemoteSettings.FORWARD_SLASH_STRING + this.f35381b;
        }

        public C4557f(long j, long j2) {
            if (j2 == 0) {
                this.f35380a = 0L;
                this.f35381b = 1L;
                return;
            }
            this.f35380a = j;
            this.f35381b = j2;
        }
    }

    static {
        C4556e[] c4556eArr;
        C4556e[] c4556eArr2 = {new C4556e(TAG_NEW_SUBFILE_TYPE, 254, 4), new C4556e(TAG_SUBFILE_TYPE, 255, 4), new C4556e(TAG_IMAGE_WIDTH, 256, 3, 4), new C4556e(TAG_IMAGE_LENGTH, 257, 3, 4), new C4556e(TAG_BITS_PER_SAMPLE, WGL4Names.NUMBER_OF_MAC_GLYPHS, 3), new C4556e(TAG_COMPRESSION, 259, 3), new C4556e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new C4556e(TAG_IMAGE_DESCRIPTION, BitmapUtil.IMAGE_270_DEGREE, 2), new C4556e(TAG_MAKE, 271, 2), new C4556e(TAG_MODEL, 272, 2), new C4556e(TAG_STRIP_OFFSETS, 273, 3, 4), new C4556e(TAG_ORIENTATION, 274, 3), new C4556e(TAG_SAMPLES_PER_PIXEL, 277, 3), new C4556e(TAG_ROWS_PER_STRIP, 278, 3, 4), new C4556e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new C4556e(TAG_X_RESOLUTION, 282, 5), new C4556e(TAG_Y_RESOLUTION, 283, 5), new C4556e(TAG_PLANAR_CONFIGURATION, 284, 3), new C4556e(TAG_RESOLUTION_UNIT, 296, 3), new C4556e(TAG_TRANSFER_FUNCTION, 301, 3), new C4556e(TAG_SOFTWARE, 305, 2), new C4556e(TAG_DATETIME, 306, 2), new C4556e(TAG_ARTIST, 315, 2), new C4556e(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new C4556e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new C4556e("SubIFDPointer", 330, 4), new C4556e(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new C4556e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, SyslogConstants.SYSLOG_PORT, 4), new C4556e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new C4556e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new C4556e(TAG_Y_CB_CR_POSITIONING, 531, 3), new C4556e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new C4556e(TAG_COPYRIGHT, 33432, 2), new C4556e("ExifIFDPointer", 34665, 4), new C4556e("GPSInfoIFDPointer", 34853, 4), new C4556e(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new C4556e(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new C4556e(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new C4556e(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new C4556e(TAG_RW2_ISO, 23, 3), new C4556e(TAG_RW2_JPG_FROM_RAW, 46, 7), new C4556e(TAG_XMP, 700, 1)};
        f35313W = c4556eArr2;
        C4556e[] c4556eArr3 = {new C4556e(TAG_EXPOSURE_TIME, 33434, 5), new C4556e(TAG_F_NUMBER, 33437, 5), new C4556e(TAG_EXPOSURE_PROGRAM, 34850, 3), new C4556e(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new C4556e(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new C4556e(TAG_OECF, 34856, 7), new C4556e(TAG_SENSITIVITY_TYPE, 34864, 3), new C4556e(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new C4556e(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new C4556e(TAG_ISO_SPEED, 34867, 4), new C4556e(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new C4556e(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new C4556e(TAG_EXIF_VERSION, 36864, 2), new C4556e(TAG_DATETIME_ORIGINAL, 36867, 2), new C4556e(TAG_DATETIME_DIGITIZED, 36868, 2), new C4556e(TAG_OFFSET_TIME, 36880, 2), new C4556e(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new C4556e(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new C4556e(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new C4556e(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new C4556e(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new C4556e(TAG_APERTURE_VALUE, 37378, 5), new C4556e(TAG_BRIGHTNESS_VALUE, 37379, 10), new C4556e(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new C4556e(TAG_MAX_APERTURE_VALUE, 37381, 5), new C4556e(TAG_SUBJECT_DISTANCE, 37382, 5), new C4556e(TAG_METERING_MODE, 37383, 3), new C4556e(TAG_LIGHT_SOURCE, 37384, 3), new C4556e(TAG_FLASH, 37385, 3), new C4556e(TAG_FOCAL_LENGTH, 37386, 5), new C4556e(TAG_SUBJECT_AREA, 37396, 3), new C4556e(TAG_MAKER_NOTE, 37500, 7), new C4556e(TAG_USER_COMMENT, 37510, 7), new C4556e(TAG_SUBSEC_TIME, 37520, 2), new C4556e(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new C4556e(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new C4556e(TAG_FLASHPIX_VERSION, 40960, 7), new C4556e(TAG_COLOR_SPACE, 40961, 3), new C4556e(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new C4556e(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new C4556e(TAG_RELATED_SOUND_FILE, 40964, 2), new C4556e("InteroperabilityIFDPointer", 40965, 4), new C4556e(TAG_FLASH_ENERGY, 41483, 5), new C4556e(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new C4556e(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new C4556e(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new C4556e(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new C4556e(TAG_SUBJECT_LOCATION, 41492, 3), new C4556e(TAG_EXPOSURE_INDEX, 41493, 5), new C4556e(TAG_SENSING_METHOD, 41495, 3), new C4556e(TAG_FILE_SOURCE, 41728, 7), new C4556e(TAG_SCENE_TYPE, 41729, 7), new C4556e(TAG_CFA_PATTERN, 41730, 7), new C4556e(TAG_CUSTOM_RENDERED, 41985, 3), new C4556e(TAG_EXPOSURE_MODE, 41986, 3), new C4556e(TAG_WHITE_BALANCE, 41987, 3), new C4556e(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new C4556e(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new C4556e(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new C4556e(TAG_GAIN_CONTROL, 41991, 3), new C4556e(TAG_CONTRAST, 41992, 3), new C4556e(TAG_SATURATION, 41993, 3), new C4556e(TAG_SHARPNESS, 41994, 3), new C4556e(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new C4556e(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new C4556e(TAG_IMAGE_UNIQUE_ID, 42016, 2), new C4556e("CameraOwnerName", 42032, 2), new C4556e(TAG_BODY_SERIAL_NUMBER, 42033, 2), new C4556e(TAG_LENS_SPECIFICATION, 42034, 5), new C4556e(TAG_LENS_MAKE, 42035, 2), new C4556e(TAG_LENS_MODEL, 42036, 2), new C4556e(TAG_GAMMA, 42240, 5), new C4556e(TAG_DNG_VERSION, 50706, 1), new C4556e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        f35314X = c4556eArr3;
        C4556e[] c4556eArr4 = {new C4556e(TAG_GPS_VERSION_ID, 0, 1), new C4556e(TAG_GPS_LATITUDE_REF, 1, 2), new C4556e(TAG_GPS_LATITUDE, 2, 5, 10), new C4556e(TAG_GPS_LONGITUDE_REF, 3, 2), new C4556e(TAG_GPS_LONGITUDE, 4, 5, 10), new C4556e(TAG_GPS_ALTITUDE_REF, 5, 1), new C4556e(TAG_GPS_ALTITUDE, 6, 5), new C4556e(TAG_GPS_TIMESTAMP, 7, 5), new C4556e(TAG_GPS_SATELLITES, 8, 2), new C4556e(TAG_GPS_STATUS, 9, 2), new C4556e(TAG_GPS_MEASURE_MODE, 10, 2), new C4556e(TAG_GPS_DOP, 11, 5), new C4556e(TAG_GPS_SPEED_REF, 12, 2), new C4556e(TAG_GPS_SPEED, 13, 5), new C4556e(TAG_GPS_TRACK_REF, 14, 2), new C4556e(TAG_GPS_TRACK, 15, 5), new C4556e(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new C4556e(TAG_GPS_IMG_DIRECTION, 17, 5), new C4556e(TAG_GPS_MAP_DATUM, 18, 2), new C4556e(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new C4556e(TAG_GPS_DEST_LATITUDE, 20, 5), new C4556e(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new C4556e(TAG_GPS_DEST_LONGITUDE, 22, 5), new C4556e(TAG_GPS_DEST_BEARING_REF, 23, 2), new C4556e(TAG_GPS_DEST_BEARING, 24, 5), new C4556e(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new C4556e(TAG_GPS_DEST_DISTANCE, 26, 5), new C4556e(TAG_GPS_PROCESSING_METHOD, 27, 7), new C4556e(TAG_GPS_AREA_INFORMATION, 28, 7), new C4556e(TAG_GPS_DATESTAMP, 29, 2), new C4556e(TAG_GPS_DIFFERENTIAL, 30, 3), new C4556e(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        f35315Y = c4556eArr4;
        C4556e[] c4556eArr5 = {new C4556e(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        f35316Z = c4556eArr5;
        C4556e[] c4556eArr6 = {new C4556e(TAG_NEW_SUBFILE_TYPE, 254, 4), new C4556e(TAG_SUBFILE_TYPE, 255, 4), new C4556e(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new C4556e(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new C4556e(TAG_BITS_PER_SAMPLE, WGL4Names.NUMBER_OF_MAC_GLYPHS, 3), new C4556e(TAG_COMPRESSION, 259, 3), new C4556e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new C4556e(TAG_IMAGE_DESCRIPTION, BitmapUtil.IMAGE_270_DEGREE, 2), new C4556e(TAG_MAKE, 271, 2), new C4556e(TAG_MODEL, 272, 2), new C4556e(TAG_STRIP_OFFSETS, 273, 3, 4), new C4556e(TAG_THUMBNAIL_ORIENTATION, 274, 3), new C4556e(TAG_SAMPLES_PER_PIXEL, 277, 3), new C4556e(TAG_ROWS_PER_STRIP, 278, 3, 4), new C4556e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new C4556e(TAG_X_RESOLUTION, 282, 5), new C4556e(TAG_Y_RESOLUTION, 283, 5), new C4556e(TAG_PLANAR_CONFIGURATION, 284, 3), new C4556e(TAG_RESOLUTION_UNIT, 296, 3), new C4556e(TAG_TRANSFER_FUNCTION, 301, 3), new C4556e(TAG_SOFTWARE, 305, 2), new C4556e(TAG_DATETIME, 306, 2), new C4556e(TAG_ARTIST, 315, 2), new C4556e(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new C4556e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new C4556e("SubIFDPointer", 330, 4), new C4556e(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new C4556e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, SyslogConstants.SYSLOG_PORT, 4), new C4556e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new C4556e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new C4556e(TAG_Y_CB_CR_POSITIONING, 531, 3), new C4556e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new C4556e(TAG_COPYRIGHT, 33432, 2), new C4556e("ExifIFDPointer", 34665, 4), new C4556e("GPSInfoIFDPointer", 34853, 4), new C4556e(TAG_DNG_VERSION, 50706, 1), new C4556e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        f35317a0 = c4556eArr6;
        f35318b0 = new C4556e(TAG_STRIP_OFFSETS, 273, 3);
        C4556e[] c4556eArr7 = {new C4556e(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new C4556e("CameraSettingsIFDPointer", 8224, 4), new C4556e("ImageProcessingIFDPointer", 8256, 4)};
        f35319c0 = c4556eArr7;
        C4556e[] c4556eArr8 = {new C4556e(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new C4556e(TAG_ORF_PREVIEW_IMAGE_LENGTH, WGL4Names.NUMBER_OF_MAC_GLYPHS, 4)};
        f35320d0 = c4556eArr8;
        C4556e[] c4556eArr9 = {new C4556e(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        f35321e0 = c4556eArr9;
        C4556e[] c4556eArr10 = {new C4556e(TAG_COLOR_SPACE, 55, 3)};
        f35322f0 = c4556eArr10;
        C4556e[][] c4556eArr11 = {c4556eArr2, c4556eArr3, c4556eArr4, c4556eArr5, c4556eArr6, c4556eArr2, c4556eArr7, c4556eArr8, c4556eArr9, c4556eArr10};
        f35323g0 = c4556eArr11;
        f35324h0 = new C4556e[]{new C4556e("SubIFDPointer", 330, 4), new C4556e("ExifIFDPointer", 34665, 4), new C4556e("GPSInfoIFDPointer", 34853, 4), new C4556e("InteroperabilityIFDPointer", 40965, 4), new C4556e("CameraSettingsIFDPointer", 8224, 1), new C4556e("ImageProcessingIFDPointer", 8256, 1)};
        f35325i0 = new HashMap[c4556eArr11.length];
        f35326j0 = new HashMap[c4556eArr11.length];
        f35327k0 = new HashSet(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP));
        f35328l0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f35329m0 = forName;
        f35330n0 = "Exif\u0000\u0000".getBytes(forName);
        f35331o0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f35308R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f35309S = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4556e[][] c4556eArr12 = f35323g0;
            if (i < c4556eArr12.length) {
                f35325i0[i] = new HashMap();
                f35326j0[i] = new HashMap();
                for (C4556e c4556e : c4556eArr12[i]) {
                    f35325i0[i].put(Integer.valueOf(c4556e.f35376a), c4556e);
                    f35326j0[i].put(c4556e.f35377b, c4556e);
                }
                i++;
            } else {
                HashMap hashMap = f35328l0;
                C4556e[] c4556eArr13 = f35324h0;
                hashMap.put(Integer.valueOf(c4556eArr13[0].f35376a), 5);
                hashMap.put(Integer.valueOf(c4556eArr13[1].f35376a), 1);
                hashMap.put(Integer.valueOf(c4556eArr13[2].f35376a), 2);
                hashMap.put(Integer.valueOf(c4556eArr13[3].f35376a), 3);
                hashMap.put(Integer.valueOf(c4556eArr13[4].f35376a), 7);
                hashMap.put(Integer.valueOf(c4556eArr13[5].f35376a), 8);
                f35332p0 = Pattern.compile(".*[1-9].*");
                f35333q0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f35334r0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f35335s0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public ExifInterface(@NonNull File file) throws IOException {
        C4556e[][] c4556eArr = f35323g0;
        this.f35346f = new HashMap[c4556eArr.length];
        this.f35347g = new HashSet(c4556eArr.length);
        this.f35348h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            m54560t(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    /* renamed from: B */
    public static boolean m54603B(FileDescriptor fileDescriptor) {
        try {
            AbstractC4559a.C4560a.m54518c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: D */
    public static boolean m54601D(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    /* renamed from: H */
    public static Long m54597H(String str, String str2, String str3) {
        if (str != null && f35332p0.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date parse = f35308R.parse(str, parsePosition);
                if (parse == null && (parse = f35309S.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    int i = 1;
                    String substring = str3.substring(0, 1);
                    int parseInt = Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = Integer.parseInt(str3.substring(4, 6));
                    if ((Marker.ANY_NON_NULL_MARKER.equals(substring) || HelpFormatter.DEFAULT_OPT_PREFIX.equals(substring)) && ":".equals(str3.substring(3, 4)) && parseInt <= 14) {
                        int i2 = ((parseInt * 60) + parseInt2) * 60000;
                        if (!HelpFormatter.DEFAULT_OPT_PREFIX.equals(substring)) {
                            i = -1;
                        }
                        time += i2 * i;
                    }
                }
                if (str2 != null) {
                    time += AbstractC4559a.m54522f(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* renamed from: U */
    public static boolean m54584U(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: c */
    public static double m54577c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            String[] split3 = split[1].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            String[] split4 = split[2].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals(LONGITUDE_EAST)) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isSupportedMimeType(@NonNull String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1875291391:
                    if (lowerCase.equals("image/x-fuji-raf")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1635437028:
                    if (lowerCase.equals("image/x-samsung-srw")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1594371159:
                    if (lowerCase.equals("image/x-sony-arw")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1487464693:
                    if (lowerCase.equals(Utils.MIME_TYPE_HEIC)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1487464690:
                    if (lowerCase.equals(Utils.MIME_TYPE_HEIF)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1487394660:
                    if (lowerCase.equals(Utils.MIME_TYPE_JPEG)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1487018032:
                    if (lowerCase.equals(Utils.MIME_TYPE_WEBP)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1423313290:
                    if (lowerCase.equals("image/x-adobe-dng")) {
                        c = 7;
                        break;
                    }
                    break;
                case -985160897:
                    if (lowerCase.equals("image/x-panasonic-rw2")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -879258763:
                    if (lowerCase.equals("image/png")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -332763809:
                    if (lowerCase.equals("image/x-pentax-pef")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1378106698:
                    if (lowerCase.equals("image/x-olympus-orf")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2099152104:
                    if (lowerCase.equals("image/x-nikon-nef")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 2099152524:
                    if (lowerCase.equals("image/x-nikon-nrw")) {
                        c = TokenParser.f74557CR;
                        break;
                    }
                    break;
                case 2111234748:
                    if (lowerCase.equals("image/x-canon-cr2")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                    return true;
                default:
                    return false;
            }
        }
        throw new NullPointerException("mimeType shouldn't be null");
    }

    /* renamed from: q */
    public static Pair m54563q(String str) {
        int intValue;
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair m54563q = m54563q(split[0]);
            if (((Integer) m54563q.first).intValue() == 2) {
                return m54563q;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair m54563q2 = m54563q(split[i2]);
                if (!((Integer) m54563q2.first).equals(m54563q.first) && !((Integer) m54563q2.second).equals(m54563q.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) m54563q.first).intValue();
                }
                if (((Integer) m54563q.second).intValue() != -1 && (((Integer) m54563q2.first).equals(m54563q.second) || ((Integer) m54563q2.second).equals(m54563q.second))) {
                    i = ((Integer) m54563q.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    m54563q = new Pair(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    m54563q = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return m54563q;
        } else if (str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            String[] split2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        } else {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    int i3 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                    if (i3 >= 0 && parseLong <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new Pair(3, 4);
                    }
                    if (i3 < 0) {
                        return new Pair(9, -1);
                    }
                    return new Pair(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair(2, -1);
            }
        }
    }

    /* renamed from: u */
    public static boolean m54559u(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f35330n0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f35330n0;
            if (i < bArr3.length) {
                if (bArr2[i] != bArr3[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: w */
    public static boolean m54557w(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f35339y;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: A */
    public final boolean m54604A(byte[] bArr) {
        C4553b c4553b;
        boolean z = false;
        C4553b c4553b2 = null;
        try {
            c4553b = new C4553b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m54594K = m54594K(c4553b);
            this.f35348h = m54594K;
            c4553b.setByteOrder(m54594K);
            if (c4553b.readShort() == 85) {
                z = true;
            }
            c4553b.close();
            return z;
        } catch (Exception unused2) {
            c4553b2 = c4553b;
            if (c4553b2 != null) {
                c4553b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c4553b2 = c4553b;
            if (c4553b2 != null) {
                c4553b2.close();
            }
            throw th;
        }
    }

    /* renamed from: C */
    public final boolean m54602C(HashMap hashMap) {
        C4555d c4555d;
        C4555d c4555d2 = (C4555d) hashMap.get(TAG_BITS_PER_SAMPLE);
        if (c4555d2 != null) {
            int[] iArr = (int[]) c4555d2.m54531o(this.f35348h);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f35344d == 3 && (c4555d = (C4555d) hashMap.get(TAG_PHOTOMETRIC_INTERPRETATION)) != null) {
                int m54533m = c4555d.m54533m(this.f35348h);
                if ((m54533m == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (m54533m == 6 && Arrays.equals(iArr, iArr2))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m54600E(HashMap hashMap) {
        C4555d c4555d = (C4555d) hashMap.get(TAG_IMAGE_LENGTH);
        C4555d c4555d2 = (C4555d) hashMap.get(TAG_IMAGE_WIDTH);
        if (c4555d != null && c4555d2 != null) {
            int m54533m = c4555d.m54533m(this.f35348h);
            int m54533m2 = c4555d2.m54533m(this.f35348h);
            if (m54533m <= 512 && m54533m2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m54599F(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f35299I;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f35300J;
                    if (i2 < bArr3.length) {
                        if (bArr[f35299I.length + i2 + 4] != bArr3[i2]) {
                            return false;
                        }
                        i2++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m54598G(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = 0
        L4:
            androidx.exifinterface.media.ExifInterface$e[][] r2 = androidx.exifinterface.media.ExifInterface.f35323g0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f35346f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f35345e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.m54571i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f35344d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f35344d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = m54584U(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            androidx.exifinterface.media.ExifInterface$g r0 = new androidx.exifinterface.media.ExifInterface$g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f35345e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.m54565o(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f35344d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.m54573g(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.m54570j(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.m54566n(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.m54567m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f35356p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.seek(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.m54585T(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            androidx.exifinterface.media.ExifInterface$b r1 = new androidx.exifinterface.media.ExifInterface$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f35344d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.m54572h(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.m54569k(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.m54568l(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.m54564p(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.m54579a()
            boolean r5 = androidx.exifinterface.media.ExifInterface.f35336v
            if (r5 == 0) goto Lac
        L97:
            r4.m54595J()
            goto Lac
        L9b:
            boolean r0 = androidx.exifinterface.media.ExifInterface.f35336v     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.m54579a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.m54579a()
            boolean r0 = androidx.exifinterface.media.ExifInterface.f35336v
            if (r0 == 0) goto Lb7
            r4.m54595J()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m54598G(java.io.InputStream):void");
    }

    /* renamed from: I */
    public final void m54596I(C4553b c4553b) {
        ByteOrder m54594K = m54594K(c4553b);
        this.f35348h = m54594K;
        c4553b.setByteOrder(m54594K);
        int readUnsignedShort = c4553b.readUnsignedShort();
        int i = this.f35344d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c4553b.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                c4553b.m54551g(i2);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: J */
    public final void m54595J() {
        for (int i = 0; i < this.f35346f.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f35346f[i].size());
            for (Map.Entry entry : this.f35346f[i].entrySet()) {
                C4555d c4555d = (C4555d) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(c4555d.toString());
                sb2.append(", tagValue: '");
                sb2.append(c4555d.m54532n(this.f35348h));
                sb2.append(OperatorName.SHOW_TEXT_LINE);
            }
        }
    }

    /* renamed from: K */
    public final ByteOrder m54594K(C4553b c4553b) {
        short readShort = c4553b.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: L */
    public final void m54593L(byte[] bArr, int i) {
        C4558g c4558g = new C4558g(bArr);
        m54596I(c4558g);
        m54592M(c4558g, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m54592M(androidx.exifinterface.media.ExifInterface.C4558g r29, int r30) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m54592M(androidx.exifinterface.media.ExifInterface$g, int):void");
    }

    /* renamed from: N */
    public final void m54591N(String str) {
        for (int i = 0; i < f35323g0.length; i++) {
            this.f35346f[i].remove(str);
        }
    }

    /* renamed from: O */
    public final void m54590O(int i, String str, String str2) {
        if (!this.f35346f[i].isEmpty() && this.f35346f[i].get(str) != null) {
            HashMap hashMap = this.f35346f[i];
            hashMap.put(str2, hashMap.get(str));
            this.f35346f[i].remove(str);
        }
    }

    /* renamed from: P */
    public final void m54589P(C4558g c4558g, int i) {
        C4555d c4555d = (C4555d) this.f35346f[i].get(TAG_IMAGE_LENGTH);
        C4555d c4555d2 = (C4555d) this.f35346f[i].get(TAG_IMAGE_WIDTH);
        if (c4555d == null || c4555d2 == null) {
            C4555d c4555d3 = (C4555d) this.f35346f[i].get(TAG_JPEG_INTERCHANGE_FORMAT);
            C4555d c4555d4 = (C4555d) this.f35346f[i].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (c4555d3 != null && c4555d4 != null) {
                int m54533m = c4555d3.m54533m(this.f35348h);
                int m54533m2 = c4555d3.m54533m(this.f35348h);
                c4558g.seek(m54533m);
                byte[] bArr = new byte[m54533m2];
                c4558g.readFully(bArr);
                m54572h(new C4553b(bArr), m54533m, i);
            }
        }
    }

    /* renamed from: Q */
    public final void m54588Q(InputStream inputStream, OutputStream outputStream) {
        C4555d c4555d;
        if (f35336v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        C4553b c4553b = new C4553b(inputStream);
        C4554c c4554c = new C4554c(outputStream, ByteOrder.BIG_ENDIAN);
        if (c4553b.readByte() == -1) {
            c4554c.writeByte(-1);
            if (c4553b.readByte() == -40) {
                c4554c.writeByte(-40);
                if (getAttribute(TAG_XMP) != null && this.f35361u) {
                    c4555d = (C4555d) this.f35346f[0].remove(TAG_XMP);
                } else {
                    c4555d = null;
                }
                c4554c.writeByte(-1);
                c4554c.writeByte(-31);
                m54580Y(c4554c);
                if (c4555d != null) {
                    this.f35346f[0].put(TAG_XMP, c4555d);
                }
                byte[] bArr = new byte[4096];
                while (c4553b.readByte() == -1) {
                    byte readByte = c4553b.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c4554c.writeByte(-1);
                            c4554c.writeByte(readByte);
                            int readUnsignedShort = c4553b.readUnsignedShort();
                            c4554c.m54546j(readUnsignedShort);
                            int i = readUnsignedShort - 2;
                            if (i >= 0) {
                                while (i > 0) {
                                    int read = c4553b.read(bArr, 0, Math.min(i, 4096));
                                    if (read >= 0) {
                                        c4554c.write(bArr, 0, read);
                                        i -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = c4553b.readUnsignedShort();
                            int i2 = readUnsignedShort2 - 2;
                            if (i2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (i2 >= 6) {
                                    c4553b.readFully(bArr2);
                                    if (Arrays.equals(bArr2, f35330n0)) {
                                        c4553b.m54551g(readUnsignedShort2 - 8);
                                    }
                                }
                                c4554c.writeByte(-1);
                                c4554c.writeByte(readByte);
                                c4554c.m54546j(readUnsignedShort2);
                                if (i2 >= 6) {
                                    i2 = readUnsignedShort2 - 8;
                                    c4554c.write(bArr2);
                                }
                                while (i2 > 0) {
                                    int read2 = c4553b.read(bArr, 0, Math.min(i2, 4096));
                                    if (read2 >= 0) {
                                        c4554c.write(bArr, 0, read2);
                                        i2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c4554c.writeByte(-1);
                        c4554c.writeByte(readByte);
                        AbstractC4559a.m54524d(c4553b, c4554c);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: R */
    public final void m54587R(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f35336v) {
            StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        C4553b c4553b = new C4553b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C4554c c4554c = new C4554c(outputStream, byteOrder);
        byte[] bArr = f35295E;
        AbstractC4559a.m54523e(c4553b, c4554c, bArr.length);
        int i = this.f35356p;
        if (i == 0) {
            int readInt = c4553b.readInt();
            c4554c.m54549d(readInt);
            AbstractC4559a.m54523e(c4553b, c4554c, readInt + 8);
        } else {
            AbstractC4559a.m54523e(c4553b, c4554c, (i - bArr.length) - 8);
            c4553b.m54551g(c4553b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            C4554c c4554c2 = new C4554c(byteArrayOutputStream, byteOrder);
            m54580Y(c4554c2);
            byte[] byteArray = ((ByteArrayOutputStream) c4554c2.f35370a).toByteArray();
            c4554c.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c4554c.m54549d((int) crc32.getValue());
            AbstractC4559a.m54526b(byteArrayOutputStream);
            AbstractC4559a.m54524d(c4553b, c4554c);
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            AbstractC4559a.m54526b(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: S */
    public final void m54586S(InputStream inputStream, OutputStream outputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        if (f35336v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveWebpAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C4553b c4553b = new C4553b(inputStream, byteOrder);
        C4554c c4554c = new C4554c(outputStream, byteOrder);
        byte[] bArr = f35299I;
        AbstractC4559a.m54523e(c4553b, c4554c, bArr.length);
        byte[] bArr2 = f35300J;
        c4553b.m54551g(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C4554c c4554c2 = new C4554c(byteArrayOutputStream2, byteOrder);
                    int i6 = this.f35356p;
                    if (i6 != 0) {
                        AbstractC4559a.m54523e(c4553b, c4554c2, (i6 - ((bArr.length + 4) + bArr2.length)) - 8);
                        c4553b.m54551g(4);
                        int readInt = c4553b.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        c4553b.m54551g(readInt);
                        m54580Y(c4554c2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        c4553b.readFully(bArr3);
                        byte[] bArr4 = f35303M;
                        boolean z2 = false;
                        boolean z3 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int readInt2 = c4553b.readInt();
                            if (readInt2 % 2 == 1) {
                                i5 = readInt2 + 1;
                            } else {
                                i5 = readInt2;
                            }
                            byte[] bArr5 = new byte[i5];
                            c4553b.readFully(bArr5);
                            byte b = (byte) (8 | bArr5[0]);
                            bArr5[0] = b;
                            if (((b >> 1) & 1) == 1) {
                                z2 = true;
                            }
                            c4554c2.write(bArr4);
                            c4554c2.m54549d(readInt2);
                            c4554c2.write(bArr5);
                            if (z2) {
                                m54576d(c4553b, c4554c2, f35306P, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        c4553b.readFully(bArr6);
                                        z = !Arrays.equals(bArr6, f35307Q);
                                    } catch (EOFException unused) {
                                        z = true;
                                    }
                                    if (z) {
                                        break;
                                    }
                                    m54575e(c4553b, c4554c2, bArr6);
                                }
                                m54580Y(c4554c2);
                            } else {
                                m54576d(c4553b, c4554c2, f35305O, f35304N);
                                m54580Y(c4554c2);
                            }
                        } else {
                            byte[] bArr7 = f35305O;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f35304N)) {
                                int readInt3 = c4553b.readInt();
                                if (readInt3 % 2 == 1) {
                                    i = readInt3 + 1;
                                } else {
                                    i = readInt3;
                                }
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    c4553b.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    c4553b.readFully(bArr9);
                                    if (Arrays.equals(f35302L, bArr9)) {
                                        int readInt4 = c4553b.readInt();
                                        i4 = (readInt4 << 2) >> 18;
                                        i -= 10;
                                        i2 = (readInt4 << 18) >> 18;
                                        i3 = readInt4;
                                        z3 = false;
                                    } else {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                } else if (Arrays.equals(bArr3, f35304N)) {
                                    if (c4553b.readByte() == 47) {
                                        i3 = c4553b.readInt();
                                        i2 = (i3 & 16383) + 1;
                                        i4 = ((i3 & 268419072) >>> 14) + 1;
                                        if ((i3 & 268435456) == 0) {
                                            z3 = false;
                                        }
                                        i -= 5;
                                    } else {
                                        throw new IOException("Error checking VP8L signature");
                                    }
                                } else {
                                    i2 = 0;
                                    z3 = false;
                                    i3 = 0;
                                    i4 = 0;
                                }
                                c4554c2.write(bArr4);
                                c4554c2.m54549d(10);
                                byte[] bArr10 = new byte[10];
                                if (z3) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i7 = i2 - 1;
                                int i8 = i4 - 1;
                                bArr10[4] = (byte) i7;
                                bArr10[5] = (byte) (i7 >> 8);
                                bArr10[6] = (byte) (i7 >> 16);
                                bArr10[7] = (byte) i8;
                                bArr10[8] = (byte) (i8 >> 8);
                                bArr10[9] = (byte) (i8 >> 16);
                                c4554c2.write(bArr10);
                                c4554c2.write(bArr3);
                                c4554c2.m54549d(readInt3);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    c4554c2.write(bArr8);
                                    c4554c2.write(f35302L);
                                    c4554c2.m54549d(i3);
                                } else if (Arrays.equals(bArr3, f35304N)) {
                                    c4554c2.write(47);
                                    c4554c2.m54549d(i3);
                                }
                                AbstractC4559a.m54523e(c4553b, c4554c2, i);
                                m54580Y(c4554c2);
                            }
                        }
                    }
                    AbstractC4559a.m54524d(c4553b, c4554c2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = f35300J;
                    c4554c.m54549d(size + bArr11.length);
                    c4554c.write(bArr11);
                    byteArrayOutputStream2.writeTo(c4554c);
                    AbstractC4559a.m54526b(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    AbstractC4559a.m54526b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: T */
    public final void m54585T(C4553b c4553b) {
        HashMap hashMap = this.f35346f[4];
        C4555d c4555d = (C4555d) hashMap.get(TAG_COMPRESSION);
        if (c4555d != null) {
            int m54533m = c4555d.m54533m(this.f35348h);
            this.f35355o = m54533m;
            if (m54533m != 1) {
                if (m54533m != 6) {
                    if (m54533m != 7) {
                        return;
                    }
                } else {
                    m54562r(c4553b, hashMap);
                    return;
                }
            }
            if (m54602C(hashMap)) {
                m54561s(c4553b, hashMap);
                return;
            }
            return;
        }
        this.f35355o = 6;
        m54562r(c4553b, hashMap);
    }

    /* renamed from: V */
    public final void m54583V(int i, int i2) {
        if (!this.f35346f[i].isEmpty() && !this.f35346f[i2].isEmpty()) {
            C4555d c4555d = (C4555d) this.f35346f[i].get(TAG_IMAGE_LENGTH);
            C4555d c4555d2 = (C4555d) this.f35346f[i].get(TAG_IMAGE_WIDTH);
            C4555d c4555d3 = (C4555d) this.f35346f[i2].get(TAG_IMAGE_LENGTH);
            C4555d c4555d4 = (C4555d) this.f35346f[i2].get(TAG_IMAGE_WIDTH);
            if (c4555d != null && c4555d2 != null && c4555d3 != null && c4555d4 != null) {
                int m54533m = c4555d.m54533m(this.f35348h);
                int m54533m2 = c4555d2.m54533m(this.f35348h);
                int m54533m3 = c4555d3.m54533m(this.f35348h);
                int m54533m4 = c4555d4.m54533m(this.f35348h);
                if (m54533m < m54533m3 && m54533m2 < m54533m4) {
                    HashMap[] hashMapArr = this.f35346f;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: W */
    public final void m54582W(C4558g c4558g, int i) {
        C4555d m54536j;
        C4555d m54536j2;
        C4555d c4555d = (C4555d) this.f35346f[i].get(TAG_DEFAULT_CROP_SIZE);
        C4555d c4555d2 = (C4555d) this.f35346f[i].get(TAG_RW2_SENSOR_TOP_BORDER);
        C4555d c4555d3 = (C4555d) this.f35346f[i].get(TAG_RW2_SENSOR_LEFT_BORDER);
        C4555d c4555d4 = (C4555d) this.f35346f[i].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        C4555d c4555d5 = (C4555d) this.f35346f[i].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (c4555d != null) {
            if (c4555d.f35372a == 5) {
                C4557f[] c4557fArr = (C4557f[]) c4555d.m54531o(this.f35348h);
                if (c4557fArr != null && c4557fArr.length == 2) {
                    m54536j = C4555d.m54538h(c4557fArr[0], this.f35348h);
                    m54536j2 = C4555d.m54538h(c4557fArr[1], this.f35348h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c4557fArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c4555d.m54531o(this.f35348h);
                if (iArr != null && iArr.length == 2) {
                    m54536j = C4555d.m54536j(iArr[0], this.f35348h);
                    m54536j2 = C4555d.m54536j(iArr[1], this.f35348h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f35346f[i].put(TAG_IMAGE_WIDTH, m54536j);
            this.f35346f[i].put(TAG_IMAGE_LENGTH, m54536j2);
        } else if (c4555d2 != null && c4555d3 != null && c4555d4 != null && c4555d5 != null) {
            int m54533m = c4555d2.m54533m(this.f35348h);
            int m54533m2 = c4555d4.m54533m(this.f35348h);
            int m54533m3 = c4555d5.m54533m(this.f35348h);
            int m54533m4 = c4555d3.m54533m(this.f35348h);
            if (m54533m2 > m54533m && m54533m3 > m54533m4) {
                C4555d m54536j3 = C4555d.m54536j(m54533m2 - m54533m, this.f35348h);
                C4555d m54536j4 = C4555d.m54536j(m54533m3 - m54533m4, this.f35348h);
                this.f35346f[i].put(TAG_IMAGE_LENGTH, m54536j3);
                this.f35346f[i].put(TAG_IMAGE_WIDTH, m54536j4);
            }
        } else {
            m54589P(c4558g, i);
        }
    }

    /* renamed from: X */
    public final void m54581X() {
        m54583V(0, 5);
        m54583V(0, 4);
        m54583V(5, 4);
        C4555d c4555d = (C4555d) this.f35346f[1].get(TAG_PIXEL_X_DIMENSION);
        C4555d c4555d2 = (C4555d) this.f35346f[1].get(TAG_PIXEL_Y_DIMENSION);
        if (c4555d != null && c4555d2 != null) {
            this.f35346f[0].put(TAG_IMAGE_WIDTH, c4555d);
            this.f35346f[0].put(TAG_IMAGE_LENGTH, c4555d2);
        }
        if (this.f35346f[4].isEmpty() && m54600E(this.f35346f[5])) {
            HashMap[] hashMapArr = this.f35346f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        m54600E(this.f35346f[4]);
        m54590O(0, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        m54590O(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        m54590O(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        m54590O(5, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        m54590O(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        m54590O(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        m54590O(4, TAG_ORIENTATION, TAG_THUMBNAIL_ORIENTATION);
        m54590O(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        m54590O(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    /* renamed from: Y */
    public final int m54580Y(C4554c c4554c) {
        short s;
        C4556e[][] c4556eArr = f35323g0;
        int[] iArr = new int[c4556eArr.length];
        int[] iArr2 = new int[c4556eArr.length];
        for (C4556e c4556e : f35324h0) {
            m54591N(c4556e.f35377b);
        }
        if (this.f35349i) {
            if (this.f35350j) {
                m54591N(TAG_STRIP_OFFSETS);
                m54591N(TAG_STRIP_BYTE_COUNTS);
            } else {
                m54591N(TAG_JPEG_INTERCHANGE_FORMAT);
                m54591N(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            }
        }
        for (int i = 0; i < f35323g0.length; i++) {
            for (Object obj : this.f35346f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f35346f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f35346f[1].isEmpty()) {
            this.f35346f[0].put(f35324h0[1].f35377b, C4555d.m54540f(0L, this.f35348h));
        }
        if (!this.f35346f[2].isEmpty()) {
            this.f35346f[0].put(f35324h0[2].f35377b, C4555d.m54540f(0L, this.f35348h));
        }
        if (!this.f35346f[3].isEmpty()) {
            this.f35346f[1].put(f35324h0[3].f35377b, C4555d.m54540f(0L, this.f35348h));
        }
        if (this.f35349i) {
            if (this.f35350j) {
                this.f35346f[4].put(TAG_STRIP_OFFSETS, C4555d.m54536j(0, this.f35348h));
                this.f35346f[4].put(TAG_STRIP_BYTE_COUNTS, C4555d.m54536j(this.f35353m, this.f35348h));
            } else {
                this.f35346f[4].put(TAG_JPEG_INTERCHANGE_FORMAT, C4555d.m54540f(0L, this.f35348h));
                this.f35346f[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, C4555d.m54540f(this.f35353m, this.f35348h));
            }
        }
        for (int i2 = 0; i2 < f35323g0.length; i2++) {
            int i3 = 0;
            for (Map.Entry entry2 : this.f35346f[i2].entrySet()) {
                int m54530p = ((C4555d) entry2.getValue()).m54530p();
                if (m54530p > 4) {
                    i3 += m54530p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f35323g0.length; i5++) {
            if (!this.f35346f[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f35346f[i5].size() * 12) + 6 + iArr2[i5];
            }
        }
        if (this.f35349i) {
            if (this.f35350j) {
                this.f35346f[4].put(TAG_STRIP_OFFSETS, C4555d.m54536j(i4, this.f35348h));
            } else {
                this.f35346f[4].put(TAG_JPEG_INTERCHANGE_FORMAT, C4555d.m54540f(i4, this.f35348h));
            }
            this.f35352l = i4;
            i4 += this.f35353m;
        }
        if (this.f35344d == 4) {
            i4 += 8;
        }
        if (f35336v) {
            for (int i6 = 0; i6 < f35323g0.length; i6++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f35346f[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4));
            }
        }
        if (!this.f35346f[1].isEmpty()) {
            this.f35346f[0].put(f35324h0[1].f35377b, C4555d.m54540f(iArr[1], this.f35348h));
        }
        if (!this.f35346f[2].isEmpty()) {
            this.f35346f[0].put(f35324h0[2].f35377b, C4555d.m54540f(iArr[2], this.f35348h));
        }
        if (!this.f35346f[3].isEmpty()) {
            this.f35346f[1].put(f35324h0[3].f35377b, C4555d.m54540f(iArr[3], this.f35348h));
        }
        int i7 = this.f35344d;
        if (i7 != 4) {
            if (i7 != 13) {
                if (i7 == 14) {
                    c4554c.write(f35301K);
                    c4554c.m54549d(i4);
                }
            } else {
                c4554c.m54549d(i4);
                c4554c.write(f35296F);
            }
        } else if (i4 <= 65535) {
            c4554c.m54546j(i4);
            c4554c.write(f35330n0);
        } else {
            throw new IllegalStateException("Size of exif data (" + i4 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
        }
        if (this.f35348h == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c4554c.m54548g(s);
        c4554c.m54550b(this.f35348h);
        c4554c.m54546j(42);
        c4554c.m54547i(8L);
        for (int i8 = 0; i8 < f35323g0.length; i8++) {
            if (!this.f35346f[i8].isEmpty()) {
                c4554c.m54546j(this.f35346f[i8].size());
                int size = iArr[i8] + 2 + (this.f35346f[i8].size() * 12) + 4;
                for (Map.Entry entry3 : this.f35346f[i8].entrySet()) {
                    int i9 = ((C4556e) f35326j0[i8].get(entry3.getKey())).f35376a;
                    C4555d c4555d = (C4555d) entry3.getValue();
                    int m54530p2 = c4555d.m54530p();
                    c4554c.m54546j(i9);
                    c4554c.m54546j(c4555d.f35372a);
                    c4554c.m54549d(c4555d.f35373b);
                    if (m54530p2 > 4) {
                        c4554c.m54547i(size);
                        size += m54530p2;
                    } else {
                        c4554c.write(c4555d.f35375d);
                        if (m54530p2 < 4) {
                            while (m54530p2 < 4) {
                                c4554c.writeByte(0);
                                m54530p2++;
                            }
                        }
                    }
                }
                if (i8 == 0 && !this.f35346f[4].isEmpty()) {
                    c4554c.m54547i(iArr[4]);
                } else {
                    c4554c.m54547i(0L);
                }
                for (Map.Entry entry4 : this.f35346f[i8].entrySet()) {
                    byte[] bArr = ((C4555d) entry4.getValue()).f35375d;
                    if (bArr.length > 4) {
                        c4554c.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f35349i) {
            c4554c.write(getThumbnailBytes());
        }
        if (this.f35344d == 14 && i4 % 2 == 1) {
            c4554c.writeByte(0);
        }
        c4554c.m54550b(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    /* renamed from: a */
    public final void m54579a() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.f35346f[0].put(TAG_DATETIME, C4555d.m54541e(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.f35346f[0].put(TAG_IMAGE_WIDTH, C4555d.m54540f(0L, this.f35348h));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.f35346f[0].put(TAG_IMAGE_LENGTH, C4555d.m54540f(0L, this.f35348h));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.f35346f[0].put(TAG_ORIENTATION, C4555d.m54540f(0L, this.f35348h));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.f35346f[1].put(TAG_LIGHT_SOURCE, C4555d.m54540f(0L, this.f35348h));
        }
    }

    /* renamed from: b */
    public final String m54578b(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    /* renamed from: d */
    public final void m54576d(C4553b c4553b, C4554c c4554c, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            c4553b.readFully(bArr3);
            m54575e(c4553b, c4554c, bArr3);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void m54575e(C4553b c4553b, C4554c c4554c, byte[] bArr) {
        int readInt = c4553b.readInt();
        c4554c.write(bArr);
        c4554c.m54549d(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        AbstractC4559a.m54523e(c4553b, c4554c, readInt);
    }

    /* renamed from: f */
    public final C4555d m54574f(String str) {
        if (str != null) {
            if (TAG_ISO_SPEED_RATINGS.equals(str)) {
                str = TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            for (int i = 0; i < f35323g0.length; i++) {
                C4555d c4555d = (C4555d) this.f35346f[i].get(str);
                if (c4555d != null) {
                    return c4555d;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public void flipHorizontally() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i));
    }

    public void flipVertically() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i));
    }

    /* renamed from: g */
    public final void m54573g(C4558g c4558g) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC4559a.C4561b.m54517a(mediaMetadataRetriever, new C4552a(c4558g));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.f35346f[0].put(TAG_IMAGE_WIDTH, C4555d.m54536j(Integer.parseInt(str), this.f35348h));
                    }
                    if (str2 != null) {
                        this.f35346f[0].put(TAG_IMAGE_LENGTH, C4555d.m54536j(Integer.parseInt(str2), this.f35348h));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        this.f35346f[0].put(TAG_ORIENTATION, C4555d.m54536j(i, this.f35348h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c4558g.seek(parseInt2);
                            byte[] bArr = new byte[6];
                            c4558g.readFully(bArr);
                            int i2 = parseInt2 + 6;
                            int i3 = parseInt3 - 6;
                            if (Arrays.equals(bArr, f35330n0)) {
                                byte[] bArr2 = new byte[i3];
                                c4558g.readFully(bArr2);
                                this.f35356p = i2;
                                m54593L(bArr2, 0);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f35336v) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Heif meta: ");
                        sb.append(str);
                        sb.append("x");
                        sb.append(str2);
                        sb.append(", rotation ");
                        sb.append(str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th2) {
                mediaMetadataRetriever.release();
                throw th2;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public double getAltitude(double d) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int i = -1;
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble >= 0.0d && attributeInt >= 0) {
            if (attributeInt != 1) {
                i = 1;
            }
            return attributeDouble * i;
        }
        return d;
    }

    @Nullable
    public String getAttribute(@NonNull String str) {
        if (str != null) {
            C4555d m54574f = m54574f(str);
            if (m54574f != null) {
                if (!f35327k0.contains(str)) {
                    return m54574f.m54532n(this.f35348h);
                }
                if (str.equals(TAG_GPS_TIMESTAMP)) {
                    int i = m54574f.f35372a;
                    if (i != 5 && i != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m54574f.f35372a);
                        return null;
                    }
                    C4557f[] c4557fArr = (C4557f[]) m54574f.m54531o(this.f35348h);
                    if (c4557fArr != null && c4557fArr.length == 3) {
                        C4557f c4557f = c4557fArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) c4557f.f35380a) / ((float) c4557f.f35381b)));
                        C4557f c4557f2 = c4557fArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) c4557f2.f35380a) / ((float) c4557f2.f35381b)));
                        C4557f c4557f3 = c4557fArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c4557f3.f35380a) / ((float) c4557f3.f35381b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c4557fArr));
                    return null;
                }
                try {
                    return Double.toString(m54574f.m54534l(this.f35348h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @Nullable
    public byte[] getAttributeBytes(@NonNull String str) {
        if (str != null) {
            C4555d m54574f = m54574f(str);
            if (m54574f != null) {
                return m54574f.f35375d;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public double getAttributeDouble(@NonNull String str, double d) {
        if (str != null) {
            C4555d m54574f = m54574f(str);
            if (m54574f == null) {
                return d;
            }
            try {
                return m54574f.m54534l(this.f35348h);
            } catch (NumberFormatException unused) {
                return d;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public int getAttributeInt(@NonNull String str, int i) {
        if (str != null) {
            C4555d m54574f = m54574f(str);
            if (m54574f == null) {
                return i;
            }
            try {
                return m54574f.m54533m(this.f35348h);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @Nullable
    public long[] getAttributeRange(@NonNull String str) {
        if (str != null) {
            if (!this.f35360t) {
                C4555d m54574f = m54574f(str);
                if (m54574f != null) {
                    return new long[]{m54574f.f35374c, m54574f.f35375d.length};
                }
                return null;
            }
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTime() {
        return m54597H(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeDigitized() {
        return m54597H(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeOriginal() {
        return m54597H(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    @Nullable
    @SuppressLint({"AutoBoxing"})
    public Long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = f35332p0;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + TokenParser.f74560SP + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date parse = f35308R.parse(str, parsePosition);
                    if (parse == null && (parse = f35309S.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(parse.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return BitmapUtil.IMAGE_180_DEGREE;
            case 5:
            case 8:
                return BitmapUtil.IMAGE_270_DEGREE;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @Nullable
    public byte[] getThumbnail() {
        int i = this.f35355o;
        if (i != 6 && i != 7) {
            return null;
        }
        return getThumbnailBytes();
    }

    @Nullable
    public Bitmap getThumbnailBitmap() {
        if (!this.f35349i) {
            return null;
        }
        if (this.f35354n == null) {
            this.f35354n = getThumbnailBytes();
        }
        int i = this.f35355o;
        if (i != 6 && i != 7) {
            if (i == 1) {
                int length = this.f35354n.length / 3;
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    byte[] bArr = this.f35354n;
                    int i3 = i2 * 3;
                    iArr[i2] = (bArr[i3] << 16) + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
                }
                C4555d c4555d = (C4555d) this.f35346f[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
                C4555d c4555d2 = (C4555d) this.f35346f[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
                if (c4555d != null && c4555d2 != null) {
                    return Bitmap.createBitmap(iArr, c4555d2.m54533m(this.f35348h), c4555d.m54533m(this.f35348h), Bitmap.Config.ARGB_8888);
                }
            }
            return null;
        }
        return BitmapFactory.decodeByteArray(this.f35354n, 0, this.f35353m);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] getThumbnailBytes() {
        /*
            r7 = this;
            boolean r0 = r7.f35349i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r7.f35354n
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r7.f35343c     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r0 == 0) goto L29
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L25
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L52
        L1a:
            r2 = move-exception
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r6
            goto L80
        L21:
            r2 = r1
            goto L89
        L25:
            androidx.exifinterface.media.AbstractC4559a.m54526b(r0)
            return r1
        L29:
            java.lang.String r0 = r7.f35341a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            java.lang.String r2 = r7.f35341a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L18
        L35:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L80
        L39:
            r0 = r1
            r2 = r0
            goto L89
        L3d:
            java.io.FileDescriptor r0 = r7.f35342b     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            java.io.FileDescriptor r0 = androidx.exifinterface.media.AbstractC4559a.C4560a.m54519b(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            r3 = 0
            androidx.exifinterface.media.AbstractC4559a.C4560a.m54518c(r0, r3, r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            r6 = r2
            r2 = r0
            r0 = r6
        L52:
            androidx.exifinterface.media.ExifInterface$b r3 = new androidx.exifinterface.media.ExifInterface$b     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            int r4 = r7.f35352l     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            int r5 = r7.f35356p     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            int r4 = r4 + r5
            r3.m54551g(r4)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            int r4 = r7.f35353m     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            r3.readFully(r4)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            r7.f35354n = r4     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            androidx.exifinterface.media.AbstractC4559a.m54526b(r0)
            if (r2 == 0) goto L70
            androidx.exifinterface.media.AbstractC4559a.m54527a(r2)
        L70:
            return r4
        L71:
            r1 = move-exception
            r6 = r1
            r1 = r0
        L74:
            r0 = r6
            goto L80
        L76:
            goto L89
        L78:
            r2 = move-exception
            r6 = r2
            r2 = r0
            goto L74
        L7c:
            r2 = r0
            r0 = r1
            goto L89
        L80:
            androidx.exifinterface.media.AbstractC4559a.m54526b(r1)
            if (r2 == 0) goto L88
            androidx.exifinterface.media.AbstractC4559a.m54527a(r2)
        L88:
            throw r0
        L89:
            androidx.exifinterface.media.AbstractC4559a.m54526b(r0)
            if (r2 == 0) goto L91
            androidx.exifinterface.media.AbstractC4559a.m54527a(r2)
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getThumbnailBytes():byte[]");
    }

    @Nullable
    public long[] getThumbnailRange() {
        if (!this.f35360t) {
            if (!this.f35349i) {
                return null;
            }
            if (!this.f35350j || this.f35351k) {
                return new long[]{this.f35352l + this.f35356p, this.f35353m};
            }
            return null;
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
        r20.setByteOrder(r19.f35348h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0167, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150 A[LOOP:0: B:10:0x002e->B:57:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m54572h(androidx.exifinterface.media.ExifInterface.C4553b r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m54572h(androidx.exifinterface.media.ExifInterface$b, int, int):void");
    }

    public boolean hasAttribute(@NonNull String str) {
        if (m54574f(str) != null) {
            return true;
        }
        return false;
    }

    public boolean hasThumbnail() {
        return this.f35349i;
    }

    /* renamed from: i */
    public final int m54571i(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m54557w(bArr)) {
            return 4;
        }
        if (m54554z(bArr)) {
            return 9;
        }
        if (m54558v(bArr)) {
            return 12;
        }
        if (m54556x(bArr)) {
            return 7;
        }
        if (m54604A(bArr)) {
            return 10;
        }
        if (m54555y(bArr)) {
            return 13;
        }
        if (m54599F(bArr)) {
            return 14;
        }
        return 0;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        if (attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5) {
            return true;
        }
        return false;
    }

    public boolean isThumbnailCompressed() {
        if (!this.f35349i) {
            return false;
        }
        int i = this.f35355o;
        if (i != 6 && i != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m54570j(C4558g c4558g) {
        int i;
        int i2;
        m54567m(c4558g);
        C4555d c4555d = (C4555d) this.f35346f[1].get(TAG_MAKER_NOTE);
        if (c4555d != null) {
            C4558g c4558g2 = new C4558g(c4555d.f35375d);
            c4558g2.setByteOrder(this.f35348h);
            byte[] bArr = f35293C;
            byte[] bArr2 = new byte[bArr.length];
            c4558g2.readFully(bArr2);
            c4558g2.seek(0L);
            byte[] bArr3 = f35294D;
            byte[] bArr4 = new byte[bArr3.length];
            c4558g2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c4558g2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c4558g2.seek(12L);
            }
            m54592M(c4558g2, 6);
            C4555d c4555d2 = (C4555d) this.f35346f[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            C4555d c4555d3 = (C4555d) this.f35346f[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (c4555d2 != null && c4555d3 != null) {
                this.f35346f[5].put(TAG_JPEG_INTERCHANGE_FORMAT, c4555d2);
                this.f35346f[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, c4555d3);
            }
            C4555d c4555d4 = (C4555d) this.f35346f[8].get(TAG_ORF_ASPECT_FRAME);
            if (c4555d4 != null) {
                int[] iArr = (int[]) c4555d4.m54531o(this.f35348h);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        C4555d m54536j = C4555d.m54536j(i5, this.f35348h);
                        C4555d m54536j2 = C4555d.m54536j(i6, this.f35348h);
                        this.f35346f[0].put(TAG_IMAGE_WIDTH, m54536j);
                        this.f35346f[0].put(TAG_IMAGE_LENGTH, m54536j2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: k */
    public final void m54569k(C4553b c4553b) {
        if (f35336v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(c4553b);
        }
        c4553b.setByteOrder(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f35295E;
        c4553b.m54551g(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c4553b.readInt();
                byte[] bArr2 = new byte[4];
                c4553b.readFully(bArr2);
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f35297G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (!Arrays.equals(bArr2, f35298H)) {
                    if (Arrays.equals(bArr2, f35296F)) {
                        byte[] bArr3 = new byte[readInt];
                        c4553b.readFully(bArr3);
                        int readInt2 = c4553b.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f35356p = i;
                            m54593L(bArr3, 0);
                            m54581X();
                            m54585T(new C4553b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i2 = readInt + 4;
                    c4553b.m54551g(i2);
                    length = i + i2;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: l */
    public final void m54568l(C4553b c4553b) {
        boolean z = f35336v;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(c4553b);
        }
        c4553b.m54551g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c4553b.readFully(bArr);
        c4553b.readFully(bArr2);
        c4553b.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c4553b.m54551g(i - c4553b.m54552d());
        c4553b.readFully(bArr4);
        m54572h(new C4553b(bArr4), i, 5);
        c4553b.m54551g(i3 - c4553b.m54552d());
        c4553b.setByteOrder(ByteOrder.BIG_ENDIAN);
        int readInt = c4553b.readInt();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c4553b.readUnsignedShort();
            int readUnsignedShort2 = c4553b.readUnsignedShort();
            if (readUnsignedShort == f35318b0.f35376a) {
                short readShort = c4553b.readShort();
                short readShort2 = c4553b.readShort();
                C4555d m54536j = C4555d.m54536j(readShort, this.f35348h);
                C4555d m54536j2 = C4555d.m54536j(readShort2, this.f35348h);
                this.f35346f[0].put(TAG_IMAGE_LENGTH, m54536j);
                this.f35346f[0].put(TAG_IMAGE_WIDTH, m54536j2);
                if (f35336v) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append((int) readShort);
                    sb3.append(", width: ");
                    sb3.append((int) readShort2);
                    return;
                }
                return;
            }
            c4553b.m54551g(readUnsignedShort2);
        }
    }

    /* renamed from: m */
    public final void m54567m(C4558g c4558g) {
        C4555d c4555d;
        m54596I(c4558g);
        m54592M(c4558g, 0);
        m54582W(c4558g, 0);
        m54582W(c4558g, 5);
        m54582W(c4558g, 4);
        m54581X();
        if (this.f35344d == 8 && (c4555d = (C4555d) this.f35346f[1].get(TAG_MAKER_NOTE)) != null) {
            C4558g c4558g2 = new C4558g(c4555d.f35375d);
            c4558g2.setByteOrder(this.f35348h);
            c4558g2.m54551g(6);
            m54592M(c4558g2, 9);
            C4555d c4555d2 = (C4555d) this.f35346f[9].get(TAG_COLOR_SPACE);
            if (c4555d2 != null) {
                this.f35346f[1].put(TAG_COLOR_SPACE, c4555d2);
            }
        }
    }

    /* renamed from: n */
    public final void m54566n(C4558g c4558g) {
        if (f35336v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(c4558g);
        }
        m54567m(c4558g);
        C4555d c4555d = (C4555d) this.f35346f[0].get(TAG_RW2_JPG_FROM_RAW);
        if (c4555d != null) {
            m54572h(new C4553b(c4555d.f35375d), (int) c4555d.f35374c, 5);
        }
        C4555d c4555d2 = (C4555d) this.f35346f[0].get(TAG_RW2_ISO);
        C4555d c4555d3 = (C4555d) this.f35346f[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (c4555d2 != null && c4555d3 == null) {
            this.f35346f[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, c4555d2);
        }
    }

    /* renamed from: o */
    public final void m54565o(C4558g c4558g) {
        byte[] bArr = f35330n0;
        c4558g.m54551g(bArr.length);
        byte[] bArr2 = new byte[c4558g.available()];
        c4558g.readFully(bArr2);
        this.f35356p = bArr.length;
        m54593L(bArr2, 0);
    }

    /* renamed from: p */
    public final void m54564p(C4553b c4553b) {
        if (f35336v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(c4553b);
        }
        c4553b.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        c4553b.m54551g(f35299I.length);
        int readInt = c4553b.readInt() + 8;
        byte[] bArr = f35300J;
        c4553b.m54551g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c4553b.readFully(bArr2);
                int readInt2 = c4553b.readInt();
                int i = length + 8;
                if (Arrays.equals(f35301K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c4553b.readFully(bArr3);
                    this.f35356p = i;
                    m54593L(bArr3, 0);
                    m54585T(new C4553b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    c4553b.m54551g(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: r */
    public final void m54562r(C4553b c4553b, HashMap hashMap) {
        C4555d c4555d = (C4555d) hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT);
        C4555d c4555d2 = (C4555d) hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (c4555d != null && c4555d2 != null) {
            int m54533m = c4555d.m54533m(this.f35348h);
            int m54533m2 = c4555d2.m54533m(this.f35348h);
            if (this.f35344d == 7) {
                m54533m += this.f35357q;
            }
            if (m54533m > 0 && m54533m2 > 0) {
                this.f35349i = true;
                if (this.f35341a == null && this.f35343c == null && this.f35342b == null) {
                    byte[] bArr = new byte[m54533m2];
                    c4553b.m54551g(m54533m);
                    c4553b.readFully(bArr);
                    this.f35354n = bArr;
                }
                this.f35352l = m54533m;
                this.f35353m = m54533m2;
            }
            if (f35336v) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(m54533m);
                sb.append(", length: ");
                sb.append(m54533m2);
            }
        }
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    public void rotate(int i) {
        if (i % 90 == 0) {
            int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
            List list = f35337w;
            int i2 = 0;
            if (list.contains(Integer.valueOf(attributeInt))) {
                int indexOf = (list.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
                if (indexOf < 0) {
                    i2 = 4;
                }
                i2 = ((Integer) list.get(indexOf + i2)).intValue();
            } else {
                List list2 = f35338x;
                if (list2.contains(Integer.valueOf(attributeInt))) {
                    int indexOf2 = (list2.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
                    if (indexOf2 < 0) {
                        i2 = 4;
                    }
                    i2 = ((Integer) list2.get(indexOf2 + i2)).intValue();
                }
            }
            setAttribute(TAG_ORIENTATION, Integer.toString(i2));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    /* renamed from: s */
    public final void m54561s(C4553b c4553b, HashMap hashMap) {
        C4555d c4555d = (C4555d) hashMap.get(TAG_STRIP_OFFSETS);
        C4555d c4555d2 = (C4555d) hashMap.get(TAG_STRIP_BYTE_COUNTS);
        if (c4555d != null && c4555d2 != null) {
            long[] m54525c = AbstractC4559a.m54525c(c4555d.m54531o(this.f35348h));
            long[] m54525c2 = AbstractC4559a.m54525c(c4555d2.m54531o(this.f35348h));
            if (m54525c != null && m54525c.length != 0) {
                if (m54525c2 != null && m54525c2.length != 0) {
                    if (m54525c.length != m54525c2.length) {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j = 0;
                    for (long j2 : m54525c2) {
                        j += j2;
                    }
                    int i = (int) j;
                    byte[] bArr = new byte[i];
                    this.f35351k = true;
                    this.f35350j = true;
                    this.f35349i = true;
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < m54525c.length; i4++) {
                        int i5 = (int) m54525c[i4];
                        int i6 = (int) m54525c2[i4];
                        if (i4 < m54525c.length - 1 && i5 + i6 != m54525c[i4 + 1]) {
                            this.f35351k = false;
                        }
                        int i7 = i5 - i2;
                        if (i7 < 0) {
                            return;
                        }
                        try {
                            c4553b.m54551g(i7);
                            int i8 = i2 + i7;
                            byte[] bArr2 = new byte[i6];
                            try {
                                c4553b.readFully(bArr2);
                                i2 = i8 + i6;
                                System.arraycopy(bArr2, 0, bArr, i3, i6);
                                i3 += i6;
                            } catch (EOFException unused) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Failed to read ");
                                sb.append(i6);
                                sb.append(" bytes.");
                                return;
                            }
                        } catch (EOFException unused2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to skip ");
                            sb2.append(i7);
                            sb2.append(" bytes.");
                            return;
                        }
                    }
                    this.f35354n = bArr;
                    if (this.f35351k) {
                        this.f35352l = (int) m54525c[0];
                        this.f35353m = i;
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void saveAttributes() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.saveAttributes():void");
    }

    public void setAltitude(double d) {
        String str;
        if (d >= 0.0d) {
            str = "0";
        } else {
            str = "1";
        }
        setAttribute(TAG_GPS_ALTITUDE, new C4557f(Math.abs(d)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    public void setAttribute(@NonNull String str, @Nullable String str2) {
        C4556e c4556e;
        int i;
        String str3;
        Matcher matcher;
        String str4 = str;
        String str5 = str2;
        if (str4 != null) {
            if ((TAG_DATETIME.equals(str4) || TAG_DATETIME_ORIGINAL.equals(str4) || TAG_DATETIME_DIGITIZED.equals(str4)) && str5 != null) {
                boolean find = f35334r0.matcher(str5).find();
                boolean find2 = f35335s0.matcher(str5).find();
                if (str2.length() == 19 && (find || find2)) {
                    if (find2) {
                        str5 = str5.replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, ":");
                    }
                } else {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            }
            if (TAG_ISO_SPEED_RATINGS.equals(str4)) {
                str4 = TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            int i2 = 2;
            int i3 = 1;
            if (str5 != null && f35327k0.contains(str4)) {
                if (str4.equals(TAG_GPS_TIMESTAMP)) {
                    if (!f35333q0.matcher(str5).find()) {
                        Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                        return;
                    }
                    str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str5 = new C4557f(Double.parseDouble(str5)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                        return;
                    }
                }
            }
            char c = 0;
            int i4 = 0;
            while (i4 < f35323g0.length) {
                if ((i4 != 4 || this.f35349i) && (c4556e = (C4556e) f35326j0[i4].get(str4)) != null) {
                    if (str5 == null) {
                        this.f35346f[i4].remove(str4);
                    } else {
                        Pair m54563q = m54563q(str5);
                        if (c4556e.f35378c != ((Integer) m54563q.first).intValue() && c4556e.f35378c != ((Integer) m54563q.second).intValue()) {
                            int i5 = c4556e.f35379d;
                            if (i5 != -1 && (i5 == ((Integer) m54563q.first).intValue() || c4556e.f35379d == ((Integer) m54563q.second).intValue())) {
                                i = c4556e.f35379d;
                            } else {
                                int i6 = c4556e.f35378c;
                                if (i6 != i3 && i6 != 7 && i6 != i2) {
                                    if (f35336v) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Given tag (");
                                        sb.append(str4);
                                        sb.append(") value didn't match with one of expected formats: ");
                                        String[] strArr = f35310T;
                                        sb.append(strArr[c4556e.f35378c]);
                                        String str6 = "";
                                        if (c4556e.f35379d == -1) {
                                            str3 = "";
                                        } else {
                                            str3 = ", " + strArr[c4556e.f35379d];
                                        }
                                        sb.append(str3);
                                        sb.append(" (guess: ");
                                        sb.append(strArr[((Integer) m54563q.first).intValue()]);
                                        if (((Integer) m54563q.second).intValue() != -1) {
                                            str6 = ", " + strArr[((Integer) m54563q.second).intValue()];
                                        }
                                        sb.append(str6);
                                        sb.append(")");
                                    }
                                } else {
                                    i = i6;
                                }
                            }
                        } else {
                            i = c4556e.f35378c;
                        }
                        String str7 = RemoteSettings.FORWARD_SLASH_STRING;
                        switch (i) {
                            case 1:
                                this.f35346f[i4].put(str4, C4555d.m54545a(str5));
                                continue;
                                i4++;
                                i2 = 2;
                                c = 0;
                                i3 = 1;
                            case 2:
                            case 7:
                                this.f35346f[i4].put(str4, C4555d.m54541e(str5));
                                continue;
                                i4++;
                                i2 = 2;
                                c = 0;
                                i3 = 1;
                            case 3:
                                String[] split = str5.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i7 = 0; i7 < split.length; i7++) {
                                    iArr[i7] = Integer.parseInt(split[i7]);
                                }
                                this.f35346f[i4].put(str4, C4555d.m54535k(iArr, this.f35348h));
                                continue;
                                i4++;
                                i2 = 2;
                                c = 0;
                                i3 = 1;
                            case 4:
                                String[] split2 = str5.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i8 = 0; i8 < split2.length; i8++) {
                                    jArr[i8] = Long.parseLong(split2[i8]);
                                }
                                this.f35346f[i4].put(str4, C4555d.m54539g(jArr, this.f35348h));
                                continue;
                                i4++;
                                i2 = 2;
                                c = 0;
                                i3 = 1;
                            case 5:
                                String[] split3 = str5.split(",", -1);
                                C4557f[] c4557fArr = new C4557f[split3.length];
                                int i9 = 0;
                                while (i9 < split3.length) {
                                    String[] split4 = split3[i9].split(str7, -1);
                                    c4557fArr[i9] = new C4557f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[i3]));
                                    i9++;
                                    str7 = str7;
                                    i3 = 1;
                                }
                                this.f35346f[i4].put(str4, C4555d.m54537i(c4557fArr, this.f35348h));
                                continue;
                                i4++;
                                i2 = 2;
                                c = 0;
                                i3 = 1;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (f35336v) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Data format isn't one of expected formats: ");
                                    sb2.append(i);
                                    break;
                                }
                                break;
                            case 9:
                                String[] split5 = str5.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i10 = 0; i10 < split5.length; i10++) {
                                    iArr2[i10] = Integer.parseInt(split5[i10]);
                                }
                                this.f35346f[i4].put(str4, C4555d.m54543c(iArr2, this.f35348h));
                                break;
                            case 10:
                                String[] split6 = str5.split(",", -1);
                                C4557f[] c4557fArr2 = new C4557f[split6.length];
                                int i11 = 0;
                                while (i11 < split6.length) {
                                    String[] split7 = split6[i11].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                    c4557fArr2[i11] = new C4557f((long) Double.parseDouble(split7[c]), (long) Double.parseDouble(split7[i3]));
                                    i11++;
                                    c = 0;
                                }
                                this.f35346f[i4].put(str4, C4555d.m54542d(c4557fArr2, this.f35348h));
                                break;
                            case 12:
                                String[] split8 = str5.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i12 = 0; i12 < split8.length; i12++) {
                                    dArr[i12] = Double.parseDouble(split8[i12]);
                                }
                                this.f35346f[i4].put(str4, C4555d.m54544b(dArr, this.f35348h));
                                break;
                        }
                    }
                }
                i4++;
                i2 = 2;
                c = 0;
                i3 = 1;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDateTime(@NonNull Long l) {
        if (l != null) {
            if (l.longValue() >= 0) {
                String l2 = Long.toString(l.longValue() % 1000);
                for (int length = l2.length(); length < 3; length++) {
                    l2 = "0" + l2;
                }
                setAttribute(TAG_DATETIME, f35308R.format(new Date(l.longValue())));
                setAttribute(TAG_SUBSEC_TIME, l2);
                return;
            }
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        throw new NullPointerException("Timestamp should not be null.");
    }

    public void setGpsInfo(Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, new C4557f((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = f35308R.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, split[0]);
        setAttribute(TAG_GPS_TIMESTAMP, split[1]);
    }

    public void setLatLong(double d, double d2) {
        String str;
        String str2;
        if (d >= -90.0d && d <= 90.0d && !Double.isNaN(d)) {
            if (d2 >= -180.0d && d2 <= 180.0d && !Double.isNaN(d2)) {
                if (d >= 0.0d) {
                    str = "N";
                } else {
                    str = "S";
                }
                setAttribute(TAG_GPS_LATITUDE_REF, str);
                setAttribute(TAG_GPS_LATITUDE, m54578b(Math.abs(d)));
                if (d2 >= 0.0d) {
                    str2 = LONGITUDE_EAST;
                } else {
                    str2 = "W";
                }
                setAttribute(TAG_GPS_LONGITUDE_REF, str2);
                setAttribute(TAG_GPS_LONGITUDE, m54578b(Math.abs(d2)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
    }

    /* renamed from: t */
    public final void m54560t(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f35343c = null;
            this.f35341a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m54603B(fileInputStream2.getFD())) {
                        this.f35342b = fileInputStream2.getFD();
                    } else {
                        this.f35342b = null;
                    }
                    m54598G(fileInputStream2);
                    AbstractC4559a.m54526b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    AbstractC4559a.m54526b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: v */
    public final boolean m54558v(byte[] bArr) {
        C4553b c4553b;
        long readInt;
        byte[] bArr2;
        long j;
        C4553b c4553b2 = null;
        try {
            c4553b = new C4553b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            readInt = c4553b.readInt();
            bArr2 = new byte[4];
            c4553b.readFully(bArr2);
        } catch (Exception unused2) {
            c4553b2 = c4553b;
            if (c4553b2 != null) {
                c4553b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c4553b2 = c4553b;
            if (c4553b2 != null) {
                c4553b2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f35340z)) {
            c4553b.close();
            return false;
        }
        if (readInt == 1) {
            readInt = c4553b.readLong();
            j = 16;
            if (readInt < 16) {
                c4553b.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            c4553b.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            try {
                c4553b.readFully(bArr3);
                if (j3 != 1) {
                    if (Arrays.equals(bArr3, f35291A)) {
                        z = true;
                    } else if (Arrays.equals(bArr3, f35292B)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        c4553b.close();
                        return true;
                    }
                }
            } catch (EOFException unused3) {
                c4553b.close();
                return false;
            }
        }
        c4553b.close();
        return false;
    }

    /* renamed from: x */
    public final boolean m54556x(byte[] bArr) {
        C4553b c4553b;
        boolean z = false;
        C4553b c4553b2 = null;
        try {
            c4553b = new C4553b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m54594K = m54594K(c4553b);
            this.f35348h = m54594K;
            c4553b.setByteOrder(m54594K);
            short readShort = c4553b.readShort();
            z = (readShort == 20306 || readShort == 21330) ? true : true;
            c4553b.close();
            return z;
        } catch (Exception unused2) {
            c4553b2 = c4553b;
            if (c4553b2 != null) {
                c4553b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c4553b2 = c4553b;
            if (c4553b2 != null) {
                c4553b2.close();
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final boolean m54555y(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f35295E;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: z */
    public final boolean m54554z(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$b */
    /* loaded from: classes2.dex */
    public static class C4553b extends InputStream implements DataInput {

        /* renamed from: a */
        public final DataInputStream f35365a;

        /* renamed from: b */
        public int f35366b;

        /* renamed from: c */
        public ByteOrder f35367c;

        /* renamed from: d */
        public byte[] f35368d;

        /* renamed from: e */
        public int f35369e;

        public C4553b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f35369e = bArr.length;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f35365a.available();
        }

        /* renamed from: b */
        public int m54553b() {
            return this.f35369e;
        }

        /* renamed from: d */
        public int m54552d() {
            return this.f35366b;
        }

        /* renamed from: g */
        public void m54551g(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f35365a.skip(i3);
                if (skip <= 0) {
                    if (this.f35368d == null) {
                        this.f35368d = new byte[8192];
                    }
                    skip = this.f35365a.read(this.f35368d, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f35366b += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f35366b++;
            return this.f35365a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f35366b++;
            return this.f35365a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f35366b++;
            int read = this.f35365a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f35366b += 2;
            return this.f35365a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            this.f35366b += i2;
            this.f35365a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f35366b += 4;
            int read = this.f35365a.read();
            int read2 = this.f35365a.read();
            int read3 = this.f35365a.read();
            int read4 = this.f35365a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f35367c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f35367c);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f35366b += 8;
            int read = this.f35365a.read();
            int read2 = this.f35365a.read();
            int read3 = this.f35365a.read();
            int read4 = this.f35365a.read();
            int read5 = this.f35365a.read();
            int read6 = this.f35365a.read();
            int read7 = this.f35365a.read();
            int read8 = this.f35365a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f35367c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f35367c);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f35366b += 2;
            int read = this.f35365a.read();
            int read2 = this.f35365a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f35367c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f35367c);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f35366b += 2;
            return this.f35365a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f35366b++;
            return this.f35365a.readUnsignedByte();
        }

        public long readUnsignedInt() {
            return readInt() & BodyPartID.bodyIdMax;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f35366b += 2;
            int read = this.f35365a.read();
            int read2 = this.f35365a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f35367c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f35367c);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.f35367c = byteOrder;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public C4553b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.f35365a.read(bArr, i, i2);
            this.f35366b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f35366b += bArr.length;
            this.f35365a.readFully(bArr);
        }

        public C4553b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f35365a = dataInputStream;
            dataInputStream.mark(0);
            this.f35366b = 0;
            this.f35367c = byteOrder;
            this.f35369e = inputStream instanceof C4553b ? ((C4553b) inputStream).m54553b() : -1;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$g */
    /* loaded from: classes2.dex */
    public static class C4558g extends C4553b {
        public C4558g(byte[] bArr) {
            super(bArr);
            this.f35365a.mark(Integer.MAX_VALUE);
        }

        public void seek(long j) {
            int i = this.f35366b;
            if (i > j) {
                this.f35366b = 0;
                this.f35365a.reset();
            } else {
                j -= i;
            }
            m54551g((int) j);
        }

        public C4558g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f35365a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    @Nullable
    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{m54577c(attribute, attribute2), m54577c(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4));
            return null;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$e */
    /* loaded from: classes2.dex */
    public static class C4556e {

        /* renamed from: a */
        public final int f35376a;

        /* renamed from: b */
        public final String f35377b;

        /* renamed from: c */
        public final int f35378c;

        /* renamed from: d */
        public final int f35379d;

        public C4556e(String str, int i, int i2) {
            this.f35377b = str;
            this.f35376a = i;
            this.f35378c = i2;
            this.f35379d = -1;
        }

        /* renamed from: a */
        public boolean m54529a(int i) {
            int i2;
            int i3 = this.f35378c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f35379d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public C4556e(String str, int i, int i2, int i3) {
            this.f35377b = str;
            this.f35376a = i;
            this.f35378c = i2;
            this.f35379d = i3;
        }
    }

    public ExifInterface(@NonNull String str) throws IOException {
        C4556e[][] c4556eArr = f35323g0;
        this.f35346f = new HashMap[c4556eArr.length];
        this.f35347g = new HashSet(c4556eArr.length);
        this.f35348h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m54560t(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public ExifInterface(@NonNull FileDescriptor fileDescriptor) throws IOException {
        boolean z;
        FileInputStream fileInputStream;
        Throwable th2;
        C4556e[][] c4556eArr = f35323g0;
        this.f35346f = new HashMap[c4556eArr.length];
        this.f35347g = new HashSet(c4556eArr.length);
        this.f35348h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f35343c = null;
            this.f35341a = null;
            if (m54603B(fileDescriptor)) {
                this.f35342b = fileDescriptor;
                try {
                    fileDescriptor = AbstractC4559a.C4560a.m54519b(fileDescriptor);
                    z = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } else {
                this.f35342b = null;
                z = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
            } catch (Throwable th3) {
                fileInputStream = null;
                th2 = th3;
            }
            try {
                m54598G(fileInputStream);
                AbstractC4559a.m54526b(fileInputStream);
                if (z) {
                    AbstractC4559a.m54527a(fileDescriptor);
                    return;
                }
                return;
            } catch (Throwable th4) {
                th2 = th4;
                AbstractC4559a.m54526b(fileInputStream);
                if (z) {
                    AbstractC4559a.m54527a(fileDescriptor);
                }
                throw th2;
            }
        }
        throw new NullPointerException("fileDescriptor cannot be null");
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public ExifInterface(@NonNull InputStream inputStream, int i) throws IOException {
        C4556e[][] c4556eArr = f35323g0;
        this.f35346f = new HashMap[c4556eArr.length];
        this.f35347g = new HashSet(c4556eArr.length);
        this.f35348h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f35341a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f35330n0.length);
                if (!m54559u(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f35345e = true;
                this.f35343c = null;
                this.f35342b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f35343c = (AssetManager.AssetInputStream) inputStream;
                this.f35342b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m54603B(fileInputStream.getFD())) {
                        this.f35343c = null;
                        this.f35342b = fileInputStream.getFD();
                    }
                }
                this.f35343c = null;
                this.f35342b = null;
            }
            m54598G(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}

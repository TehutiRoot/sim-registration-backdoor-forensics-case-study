package th.p047co.dtac.android.dtacone.model.newsfeed;

import androidx.annotation.NonNull;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.newsfeed.NewsFeedCollection */
/* loaded from: classes8.dex */
public class NewsFeedCollection {
    @SerializedName("contents")
    List<NewsFeed> newsFeedList;
    @SerializedName("newsTopic")
    String newsTopic;

    /* renamed from: th.co.dtac.android.dtacone.model.newsfeed.NewsFeedCollection$ImageNews */
    /* loaded from: classes8.dex */
    public static class ImageNews {
        @SerializedName("height")
        private String height;
        @SerializedName("origin")
        private String imageOriginal;
        @SerializedName("thumbnail")
        private String thumbnail;
        @SerializedName("width")
        private String width;

        public ImageNews() {
        }

        public String getHeight() {
            return this.height;
        }

        public String getImageOriginal() {
            return this.imageOriginal;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }

        public String getWidth() {
            return this.width;
        }

        public ImageNews(String str, String str2, String str3, String str4) {
            this.thumbnail = str;
            this.imageOriginal = str2;
            this.width = str3;
            this.height = str4;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.model.newsfeed.NewsFeedCollection$NewsFeed */
    /* loaded from: classes8.dex */
    public static class NewsFeed {
        @SerializedName("contentDetail")
        private String contentDetail;
        @SerializedName("contentPreview")
        private String contentPreview;
        @SerializedName(ResponseProcessor.CONTENT_TYPE_IMAGE)
        private ImageNews images;
        @SerializedName("relatedLink")
        private String link;
        @SerializedName("newsId")
        private int newsId;
        @SerializedName("postedDate")
        private String postDate;
        @SerializedName("postedBy")
        private Posts posts;

        public NewsFeed() {
        }

        public String getContentDetail() {
            return this.contentDetail;
        }

        public String getContentPreview() {
            return this.contentPreview;
        }

        public ImageNews getImages() {
            return this.images;
        }

        public String getLink() {
            return this.link;
        }

        public int getNewsId() {
            return this.newsId;
        }

        public String getPostDate() {
            return this.postDate;
        }

        public Posts getPosts() {
            return this.posts;
        }

        public NewsFeed(int i, String str, String str2, String str3, ImageNews imageNews, String str4, Posts posts) {
            this.newsId = i;
            this.contentPreview = str;
            this.contentDetail = str2;
            this.link = str3;
            this.images = imageNews;
            this.postDate = str4;
            this.posts = posts;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.model.newsfeed.NewsFeedCollection$Posts */
    /* loaded from: classes8.dex */
    public static class Posts {
        @SerializedName("name")
        private String name;
        @SerializedName("profileImage")
        private String profileImage;

        public Posts() {
        }

        @NonNull
        public String getName() {
            return this.name;
        }

        public String getProfileImage() {
            return this.profileImage;
        }

        public Posts(String str, String str2) {
            this.name = str;
            this.profileImage = str2;
        }
    }

    public List<NewsFeed> getNewsFeedList() {
        return this.newsFeedList;
    }

    public String getNewsTopic() {
        return this.newsTopic;
    }
}
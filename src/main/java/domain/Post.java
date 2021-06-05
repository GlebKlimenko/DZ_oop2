package domain;

public class Post {
    private String postId;
    private String groupId;
    private int date;
    private boolean report;
    private boolean addToBookmark;
    private Content content;
    private domain.LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private int viewsCount;
}

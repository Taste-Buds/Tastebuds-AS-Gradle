package com.codepath.apps.tastebuds.models;

/**
 * Created by shawn on 2/22/15.
 */

import java.util.Date;
import java.util.ArrayList;

public class UserModel {

    private String objectId;
    private String username;
    private String emai;
    private String fbId;
    private Date createdAt;
    private Date updatedAt;
    private String location;
    private ArrayList<UserModel> userFriends; // Don't recurse on Friends of Friends

    public UserModel() { super();}

    public UserModel(User user) {

        this.objectId = user.getObjectId();
        //this.username = user.getUsername();
        //this.email = user.getEmail();
        //this.fbId = user.getfbId;
        this.createdAt = user.getCreatedAt();
        this.updatedAt = user.getUpdatedAt();
        //this.location = user.getLocation();
        //this.userFriends= UserModel.createFriendsList(user.getUserFriends);

    }

}

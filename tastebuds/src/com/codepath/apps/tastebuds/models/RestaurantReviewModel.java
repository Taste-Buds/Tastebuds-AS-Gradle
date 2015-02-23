package com.codepath.apps.tastebuds.models;

/**
 * Created by shawn on 2/22/15.
 */

import java.util.Date;
import java.util.ArrayList;

public class RestaurantReviewModel {

    private String objectId;
    private String comment;
    //private UserModel owner;
    private String placesId;
    private float rating;
    //private ArrayList<TagModel> tags;
    private Date createdAt;
    private Date updatedAt;
    private String restaurantName;
    //private ArrayList<UserPhotoModel> userPhotos;

    public RestaurantReviewModel() {
        super();
    }

    public RestaurantReviewModel(RestaurantReview restaurantReview) {
        super();
        this.objectId = restaurantReview.getObjectId();
        this.comment = restaurantReview.getText();
        //this.owner = UserModel(User user);
        this.placesId = restaurantReview.getGooglePlacesId();
        this.rating = restaurantReview.getRating();
        //this.tags = TagModel.TagsFromPointers(restaurantReview.getTags());
        this.createdAt = restaurantReview.getCreatedAt();
        this.updatedAt = restaurantReview.getUpdatedAt();
        this.restaurantName = restaurantReview.getRestaurantName();
        //this.userPhotos = UserPhotoModel.PhotosFromPointers(restaurantReview.getUserPhotos());

    }

    public ArrayList<RestaurantReviewModel> restaurantReviewModelsFromRestaurantReviews(ArrayList<RestaurantReview> restaurantReviews) {

        ArrayList<RestaurantReviewModel> restaurantReviewModels = new ArrayList<RestaurantReviewModel>();
        for (RestaurantReview restaurantReview: restaurantReviews) {
            RestaurantReviewModel restaurantReviewModel =  new RestaurantReviewModel(restaurantReview);
            restaurantReviewModels.add(restaurantReviewModel);
        }
        return restaurantReviewModels;
    }

}

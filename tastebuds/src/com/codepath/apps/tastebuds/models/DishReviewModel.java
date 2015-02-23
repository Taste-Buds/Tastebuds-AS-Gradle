package com.codepath.apps.tastebuds.models;

/**
 * Created by shawn on 2/22/15.
 */

import java.util.Date;
import java.util.ArrayList;

public class DishReviewModel {

    private String objectId;
    private String comment;
    private String dishName;
    //private UserModel owner;
    private String placesId;
    private float rating;
    //private ArrayList<TagModel> tags;
    private Date createdAt;
    private Date updatedAt;
    private String restaurantName;
    //private ArrayList<UserPhotoModel> userPhotos;

    public DishReviewModel() {
        super();
    }

    public DishReviewModel(DishReview dishReview) {
        super();
        this.objectId = dishReview.getObjectId();
        this.comment = dishReview.getText();
        this.dishName = dishReview.getDishName();
        //this.owner = UserModel(dishReview.getUser());
        this.placesId = dishReview.getGooglePlacesId();
        this.rating = dishReview.getRating();
        //this.tags = TagModel.TagsFromPointers(dishReview.getTags());
        this.createdAt = dishReview.getCreatedAt();
        this.updatedAt = dishReview.getUpdatedAt();
        this.restaurantName = dishReview.getRestaurantName();
        //this.userPhotos = UserPhotoModel.PhotosFromPointers(dishReview.getUserPhotos());

    }

    public ArrayList<DishReviewModel> restaurantReviewModelsFromRestaurantReviews(ArrayList<DishReview> dishReviews) {

        ArrayList<DishReviewModel> dishReviewModels = new ArrayList<DishReviewModel>();
        for (DishReview dishReview: dishReviews) {
            DishReviewModel dishReviewModel =  new DishReviewModel(dishReview);
            dishReviewModels.add(dishReviewModel);
        }
        return dishReviewModels;
    }
}

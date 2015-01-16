package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Item;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result index() {
        List<Item> featureItems = new ArrayList<Item>();
        List<Item> items1 = new ArrayList<Item>();
        List<Item> items2 = new ArrayList<Item>();
        List<Item> items3 = new ArrayList<Item>();
        List<Item> items4 = new ArrayList<Item>();
        List<Item> items5 = new ArrayList<Item>();
        List<Item> recommendedItems = new ArrayList<Item>();

        featureItems = Item.find.where().eq("featured", Boolean.TRUE)
                .findList();

        recommendedItems = Item.find.where().eq("recommended", Boolean.TRUE)
                .findList();

        return ok(views.html.index.render(featureItems, items1, items2, items3,
                items4, items5, recommendedItems));
    }
}

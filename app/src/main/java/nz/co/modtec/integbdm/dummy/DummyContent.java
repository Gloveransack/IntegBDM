package nz.co.modtec.integbdm.dummy;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nz.co.modtec.integbdm.R;

public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;

    static {
        addItem(new DummyItem("one_icon","Apollo1","file:///android_asset/Extrusions/Apollo1.htm"));
        addItem(new DummyItem("two_icon","Apollo2","file:///android_asset/Extrusions/Apollo2.htm"));
        addItem(new DummyItem("four_icon","Apollo4","file:///android_asset/Extrusions/Apollo4.htm"));
        addItem(new DummyItem("fourpp_icon","Apollo4 Power+","file:///android_asset/Extrusions/Apollo4P+.htm"));
        addItem(new DummyItem("six_icon","Apollo6","file:///android_asset/Extrusions/Apollo6.htm"));
        addItem(new DummyItem("array_icon","Ar-ray","file:///android_asset/Extrusions/Ar-ray.htm"));
        addItem(new DummyItem("keywaystraight_icon","Keyway straight","file:///android_asset/Extrusions/Keyway_straight.htm"));
        addItem(new DummyItem("keywayangled_icon","Keyway angled","file:///android_asset/Extrusions/Keyway_angled.htm"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.icon, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        //public final String id;
        public final String icon;
        public final String item_name;
        public final String URL;

        public DummyItem(String icon, String item_name, String URL) {
            this.icon = icon;
            this.item_name= item_name;
            this.URL = URL;
        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}

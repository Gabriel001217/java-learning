package com.study.coontainer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataBean {

    public DataBean() {
    }

    public List<Data> GetData(){
        String jsonStr="[{\n" +
                "                \"mag\": 6.1, \n" +
                "                \"place\": \"Macquarie Island region\", \n" +
                "                \"time\": 1633637581819, \n" +
                "                \"updated\": 1633648212759, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us6000fssl\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us6000fssl&format=geojson\", \n" +
                "                \"felt\": 1, \n" +
                "                \"cdi\": 1, \n" +
                "                \"mmi\": 0, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 573, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"6000fssl\", \n" +
                "                \"ids\": \",us6000fssl,usauto6000fssl,pt21280002,at00r0mitu,\", \n" +
                "                \"sources\": \",us,usauto,pt,at,\", \n" +
                "                \"types\": \",dyfi,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 4.306, \n" +
                "                \"rms\": 0.76, \n" +
                "                \"gap\": 105, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.1 - Macquarie Island region\"\n" +
                "            },  {\n" +
                "                \"mag\": 6.3, \n" +
                "                \"place\": \"South Sandwich Islands region\", \n" +
                "                \"time\": 1633319647012, \n" +
                "                \"updated\": 1633542717040, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us6000frfw\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us6000frfw&format=geojson\", \n" +
                "                \"felt\": 1, \n" +
                "                \"cdi\": 1, \n" +
                "                \"mmi\": 3.668, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 611, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"6000frfw\", \n" +
                "                \"ids\": \",us6000frfw,usauto6000frfw,at00r0fpie,pt21277001,\", \n" +
                "                \"sources\": \",us,usauto,at,pt,\", \n" +
                "                \"types\": \",dyfi,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 7.788, \n" +
                "                \"rms\": 1.01, \n" +
                "                \"gap\": 25, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.3 - South Sandwich Islands region\"\n" +
                "            },  {\n" +
                "                \"mag\": 7.3, \n" +
                "                \"place\": \"Vanuatu region\", \n" +
                "                \"time\": 1633156158845, \n" +
                "                \"updated\": 1633274923040, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us6000fr0b\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us6000fr0b&format=geojson\", \n" +
                "                \"felt\": 15, \n" +
                "                \"cdi\": 4.1, \n" +
                "                \"mmi\": 3.533, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 1, \n" +
                "                \"sig\": 826, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"6000fr0b\", \n" +
                "                \"ids\": \",at00r0c7cu,us6000fr0b,pt21275000,usauto6000fr0b,\", \n" +
                "                \"sources\": \",at,us,pt,usauto,\", \n" +
                "                \"types\": \",dyfi,impact-link,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 4.477, \n" +
                "                \"rms\": 0.54, \n" +
                "                \"gap\": 33, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 7.3 - Vanuatu region\"\n" +
                "            }, {\n" +
                "                \"mag\": 6.1, \n" +
                "                \"place\": \"241 km NNW of Nanao, Japan\", \n" +
                "                \"time\": 1632904625768, \n" +
                "                \"updated\": 1633102945040, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us6000fq2d\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us6000fq2d&format=geojson\", \n" +
                "                \"felt\": 34, \n" +
                "                \"cdi\": 5.6, \n" +
                "                \"mmi\": 2.803, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 592, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"6000fq2d\", \n" +
                "                \"ids\": \",us6000fq2d,usauto6000fq2d,at00r06t9t,pt21272000,\", \n" +
                "                \"sources\": \",us,usauto,at,pt,\", \n" +
                "                \"types\": \",dyfi,ground-failure,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 3.18, \n" +
                "                \"rms\": 0.97, \n" +
                "                \"gap\": 22, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.1 - 241 km NNW of Nanao, Japan\"\n" +
                "            },  {\n" +
                "                \"mag\": 6, \n" +
                "                \"place\": \"7 km NNW of Thrapsanón, Greece\", \n" +
                "                \"time\": 1632723442319, \n" +
                "                \"updated\": 1632992239475, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us7000fes8\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us7000fes8&format=geojson\", \n" +
                "                \"felt\": 131, \n" +
                "                \"cdi\": 7.9, \n" +
                "                \"mmi\": 7.514, \n" +
                "                \"alert\": \"yellow\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 753, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"7000fes8\", \n" +
                "                \"ids\": \",us7000fes8,usauto7000fes8,pt21270000,at00r02xh0,\", \n" +
                "                \"sources\": \",us,usauto,pt,at,\", \n" +
                "                \"types\": \",dyfi,general-text,ground-failure,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 0.304, \n" +
                "                \"rms\": 0.71, \n" +
                "                \"gap\": 36, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.0 - 7 km NNW of Thrapsanón, Greece\"\n" +
                "            }, {\n" +
                "                \"mag\": 6.1, \n" +
                "                \"place\": \"182 km WSW of Adak, Alaska\", \n" +
                "                \"time\": 1632484351401, \n" +
                "                \"updated\": 1633608163178, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us7000fe1w\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us7000fe1w&format=geojson\", \n" +
                "                \"felt\": 7, \n" +
                "                \"cdi\": 4.3, \n" +
                "                \"mmi\": 5.226, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 1, \n" +
                "                \"sig\": 575, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"7000fe1w\", \n" +
                "                \"ids\": \",us7000fe1w,at00qzxszj,usauto7000fe1w,pt21267000,ak021c9rcn11,\", \n" +
                "                \"sources\": \",us,at,usauto,pt,ak,\", \n" +
                "                \"types\": \",dyfi,ground-failure,impact-link,internal-moment-tensor,internal-origin,losspager,moment-tensor,oaf,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 0.639, \n" +
                "                \"rms\": 0.92, \n" +
                "                \"gap\": 52, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.1 - 182 km WSW of Adak, Alaska\"\n" +
                "            },  {\n" +
                "                \"mag\": 6.5, \n" +
                "                \"place\": \"78 km SW of Jiquilillo, Nicaragua\", \n" +
                "                \"time\": 1632304628560, \n" +
                "                \"updated\": 1633228037621, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us7000fdds\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us7000fdds&format=geojson\", \n" +
                "                \"felt\": 46, \n" +
                "                \"cdi\": 7, \n" +
                "                \"mmi\": 4.501, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 1, \n" +
                "                \"sig\": 682, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"7000fdds\", \n" +
                "                \"ids\": \",pt21265000,at00qztyb6,us7000fdds,usauto7000fdds,\", \n" +
                "                \"sources\": \",pt,at,us,usauto,\", \n" +
                "                \"types\": \",dyfi,ground-failure,impact-link,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 0.973, \n" +
                "                \"rms\": 1.18, \n" +
                "                \"gap\": 118, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.5 - 78 km SW of Jiquilillo, Nicaragua\"\n" +
                "            },  {\n" +
                "                \"mag\": 6.4, \n" +
                "                \"place\": \"73 km W of Talcahuano, Chile\", \n" +
                "                \"time\": 1632230072025, \n" +
                "                \"updated\": 1632683994129, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us7000fd4k\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us7000fd4k&format=geojson\", \n" +
                "                \"felt\": 83, \n" +
                "                \"cdi\": 6.4, \n" +
                "                \"mmi\": 4.74, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 683, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"7000fd4k\", \n" +
                "                \"ids\": \",us7000fd4k,usauto7000fd4k,at00qzscs9,pt21264000,\", \n" +
                "                \"sources\": \",us,usauto,at,pt,\", \n" +
                "                \"types\": \",dyfi,ground-failure,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 2.14, \n" +
                "                \"rms\": 0.7, \n" +
                "                \"gap\": 110, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.4 - 73 km W of Talcahuano, Chile\"\n" +
                "            },  {\n" +
                "                \"mag\": 6.1, \n" +
                "                \"place\": null, \n" +
                "                \"time\": 1632169526552, \n" +
                "                \"updated\": 1632934842008, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us7000fczf\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us7000fczf&format=geojson\", \n" +
                "                \"felt\": 6, \n" +
                "                \"cdi\": 3.4, \n" +
                "                \"mmi\": 4.107, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 575, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"7000fczf\", \n" +
                "                \"ids\": \",us7000fczf,usauto7000fczf,at00qzr22c,pt21263002,\", \n" +
                "                \"sources\": \",us,usauto,at,pt,\", \n" +
                "                \"types\": \",dyfi,ground-failure,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 6.709, \n" +
                "                \"rms\": 1.19, \n" +
                "                \"gap\": 14, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.1 - \"\n" +
                "            }, {\n" +
                "                \"mag\": 6.2, \n" +
                "                \"place\": \"79 km WNW of San Antonio de los Cobres, Argentina\", \n" +
                "                \"time\": 1631510293180, \n" +
                "                \"updated\": 1632321090624, \n" +
                "                \"tz\": null, \n" +
                "                \"url\": \"https://earthquake.usgs.gov/earthquakes/eventpage/us7000fap8\", \n" +
                "                \"detail\": \"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us7000fap8&format=geojson\", \n" +
                "                \"felt\": 51, \n" +
                "                \"cdi\": 5, \n" +
                "                \"mmi\": 3.922, \n" +
                "                \"alert\": \"green\", \n" +
                "                \"status\": \"reviewed\", \n" +
                "                \"tsunami\": 0, \n" +
                "                \"sig\": 617, \n" +
                "                \"net\": \"us\", \n" +
                "                \"code\": \"7000fap8\", \n" +
                "                \"ids\": \",us7000fap8,usauto7000fap8,pt21256000,at00qzcxeb,\", \n" +
                "                \"sources\": \",us,usauto,pt,at,\", \n" +
                "                \"types\": \",dyfi,ground-failure,internal-moment-tensor,internal-origin,losspager,moment-tensor,origin,phase-data,shakemap,\", \n" +
                "                \"nst\": null, \n" +
                "                \"dmin\": 1.418, \n" +
                "                \"rms\": 1.37, \n" +
                "                \"gap\": 39, \n" +
                "                \"magType\": \"mww\", \n" +
                "                \"type\": \"earthquake\", \n" +
                "                \"title\": \"M 6.2 - 79 km WNW of San Antonio de los Cobres, Argentina\"\n" +
                "            }]";
        Gson gson=new Gson();
        Type listType=new TypeToken<ArrayList<Data>>(){}.getType();
        List<Data> list= gson.fromJson(jsonStr, listType);
        return list;
    }
}

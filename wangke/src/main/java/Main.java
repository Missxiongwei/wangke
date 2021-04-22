import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int kechengid=92;
        Map map=new HashMap();
        map.put("id",kechengid);
        String s = Utlis.doGet("http://202.197.98.26:8888/LMS/ajax/coursePlayer/getStaffScoList.do", map);
        final String scoList1 = JSONObject.parseObject(s).getString("scoList");
        final JSONArray objects = JSONObject.parseArray(scoList1);
        System.out.println("课程总集数:"+objects.size());
        int ii=0;
        for (Object entity:objects.toArray()){
            final Entity entity2 = JSON.toJavaObject((JSONObject) entity, Entity.class);
            Map map1=new HashMap();
            map1.put("courseNumer","10021");
            map1.put("courseType",entity2.getType());
            map1.put("requiredTime","2");
            map1.put("href",entity2.getHref());
            map1.put("location",entity2.getLocation());
//            map1.put("suspeDate",entity2.getSuspendData());
            map1.put("url","http://202.197.98.26:9999/coursePlayer/init.do");
            map1.put("status",entity2.getStatus());
            map1.put("totalTime",entity2.getTotalTime());
            map1.put("id",entity2.getChapterId());
            map1.put("staffChapterId",entity2.getId());
            map1.put("courseId",56);
            final String sid = Utlis.doGet("http://202.197.98.26:8888/LMS/ajax/coursePlayer/onlineCoursePlayer.do",map1);
            Map map2=new HashMap();
            Random  random=new Random();
            int i = random.nextInt(20);
            map2.put("student_id","48565");
            map2.put("lesson_location",i*60);
            map2.put("lesson_status","incomplete");
            map2.put("score",0.0);
            map2.put("suspend_data","");
            map2.put("session_time","00:0"+i+":00");
            map2.put("lesson_progress",0.0);
            map2.put("masteryscore","");
            map2.put("total_time",60);
            map2.put("required_time",15);
            map2.put("session_id",sid);
            final String s1 = Utlis.doGet("http://202.197.98.26:9999/coursePlayer/loopCommit.do", map2);
            if("success".equals(s1)) {
                ii++;
                System.out.println(new Date() + "播放-" + entity2.getTitle() + "-播放完成");
            }else {
                System.out.println(new Date() + "播放-" + entity2.getTitle() + "-播放失败");
            }
        }
        System.out.println("一共播放集数"+ii);

    }

}

package json1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json1 {

    public static void main(String[] args){

//=================여기서 부터 표시한 부분까지 내가 간과하고 있던 내용....아래에 적은 주석 참고하기...=================
        JSONObject personalInfo1 = new JSONObject(); //JSON 객체를 생성

        personalInfo1.put("name","Honggildong");
        personalInfo1.put("email","gildong1@test.com");
        personalInfo1.put("age",20);
        personalInfo1.put("location","Seoul");

        System.out.println(personalInfo1);   /*result =
                                            {"name":"Honggildong","location":"Seoul","email":"gildong1@test.com","age":20}*/
        System.out.println(personalInfo1.get("name"));   //result = Honggildong

        JSONArray personList = new JSONArray();
        personList.add(personalInfo1);
        System.out.println("Person : " + personList); /*  result =
                                                                    Person : [
                                                                                {"name":"Honggildong",
                                                                                "location":"Seoul",
                                                                                "email":"gildong1@test.com",
                                                                                "age":20}
                                                                    ]
                                                        */

        JSONObject personalInfo2 = new JSONObject();
        personalInfo2.put("name","YiSunSin");
        personalInfo2.put("email","sunsin@test.com");
        personalInfo2.put("age",54);
        personalInfo2.put("location","Asan-si");
        personList.add(personalInfo2);

        System.out.println("Person : "+ personList);
        /* result = Person :[
                                {
                                    "name":"Honggildong",
                                    "location":"Seoul",
                                    "email":"gildong1@test.com",
                                    "age":20
                                },
                                {
                                    "name":"YiSunSin",
                                    "location":"Asan-si",
                                    "email":"sunsin@test.com",
                                    "age":54
                                }
                            ]
        */
        System.out.println("인덱스 1 : " + personList.get(1));
        // result = 인덱스 1 : {"name":"YiSunSin","location":"Asan-si","email":"sunsin@test.com","age":54}

//==================================여기까지 내가 간과하고 있던 내용=================================

/*  내용을 지울까 하다가 나중에 회고하기 위해 남겨둔 윗 내용
    다른 파일에서는 personList.get(1) //{"name":"YiSunSin","location":"Asan-si","email":"sunsin@test.com","age":54}
    이 상황에서 .get(parameter).get(parameter) 이렇게 두 번 사용했었는데 이 파일에서는 불가능했다.

    이유 : 내가 원하는 방식으로 데이터를 추출하려면 JSONObject 객체 내에 JSONArray 배열을 넣는 식으로 JSON을 구성해야했다.

    예를 들어,
    {"person" :
                [
                    "name":"Honggildong",
                    "location":"Seoul",
                    "email":"gildong1@test.com",
                    "age":20
                ]
    }
    이런식으로 JSONObject 안에 JSONArray 배열을 넣는 식으로 구성

    나의 경우,
    [
        {
            "name":"Honggildong",
            "location":"Seoul",
            "email":"gildong1@test.com",
            "age":20
        }
    ]
    이런 식으로 JSONArray 배열 안에 JSONArray를 구성 했기 때문에
    내가 원하는 방향(Json2.java 파일 참고)으로 데이터를 추출하지 못했다.
    */
//==================================윗 내용의 보충 추가 내용=================================
    /*  JSONArray 내에 JSONObject가 있는 경우, 내가 원하는 결과물을 추출하지 못할 것이라 설명하였지만
        아래의 방식이 있다는 것을 기억하고 나중에 이용하기 위해 추가

        지금 personList는 아래와 같이 되어있다.
        [
            {
                "name":"Honggildong",
                "location":"Seoul",
                "email":"gildong1@test.com",
                "age":20
            },
            {
                "name":"YiSunSin",
                "location":"Asan-si",
                "email":"sunsin@test.com",
                "age":54
            }
        ]

        이처럼 JSON 배열 안에 2개의 JSON 객체가 들어있다.

        만약, 배열 안의 객체 key값이 "name"인 value값만 가져오고 싶다면?

        for(int i = 0 ; i <personList.size();i++){
            System.out.println(  (   (JSONObject) personList.get(i) ).get("name")  );
                                                        ㄴ1.배열에서 인덱스 값에 해당하는 객체를 가져온다.
                                        ㄴ2.JSON객체로 캐스팅해준다.
                                                                        ㄴ3.객체의 key값이 name인 value값을 출력
        }

    */

    }
}

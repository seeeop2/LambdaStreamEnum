package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json2 {

    public static void main(String[] args){

        JSONArray ArrayOfProfessors  = new JSONArray();
        ArrayOfProfessors.add("박교수");    //JsonArray 배열에 교수 목록을 추가
        ArrayOfProfessors.add("이교수");
        ArrayOfProfessors.add("김교수");

        JSONObject JSON = new JSONObject();
        JSON.put("univ_professors",ArrayOfProfessors);    /*Json 객체는 Map형식라고 생각.
                                                            key값이 univ_professors,
                                                            value값이 배열 형식의 ArrayOfProfessors
                                                        */
        System.out.println(JSON);   // result = {"univ_professors":["박교수","이교수","김교수"]}

        JSONArray ArrayOfStudents  = new JSONArray();    //JsonArray 배열에 학생 목록을 추가
        ArrayOfStudents.add("홍길동");
        ArrayOfStudents.add("김길동");
        ArrayOfStudents.add("박길동");
        ArrayOfStudents.add("이길동");
        ArrayOfStudents.add("최길동");
        ArrayOfStudents.add("황길동");
        JSON.put("univ_students",ArrayOfStudents);
        System.out.println(JSON);   /*result = {
                                                "univ_professors":["박교수","이교수","김교수"],
                                                "univ_students":["홍길동","김길동","박길동","이길동","최길동","황길동"]
                                                }
                                     */

        JSONArray ProfessorsList = (JSONArray) JSON.get("univ_professors");
        /*교수의 이름들만 가져오고 싶다.
            그러기 위해서 일단 JSON객체에서 get(key값)을 이용해서 value값인 교수 목록을 가져왔다.
        */

        System.out.println(ProfessorsList); //result = ["박교수","이교수","김교수"]


        for(int i = 0 ; i < ProfessorsList.size();i++){
            System.out.println(ProfessorsList.get(i));
        }
        /*
        result   =  박교수
                    이교수
                    김교수

        물론 아래의 방법도 가능하다.
        System.out.println(((JSONArray) JSON.get("univ_professors")).get(0)); // result = 박교수
        그러나 배열 안의 모든 값을 가져올 때
        or
        배열 안에 값이 여러 개 있을 때
        변수에 담아서 반복문을 작성해주는 것이 편하다.
        */

        JSONArray studentsList = (JSONArray) JSON.get("univ_students");
        System.out.println(studentsList);   //result = ["홍길동","김길동","박길동","이길동","최길동","황길동"]

        for(Object obj : studentsList){
            System.out.println(obj);
            /*result =  홍길동
                        김길동
                        박길동
                        이길동
                        최길동
                        황길동
            */
        }

    }
}

/*참고 : https://velog.io/@sujin1018/%EC%8A%A4%ED%94%84%EB%A7%81-json-%ED%8C%8C%EC%8B%B1%ED%95%98%EA%B8%B0 */
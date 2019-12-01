package com.tjoeun.sj20191203_03_kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.sj20191203_03_kotlinsyntax.datas.User


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr  = ArrayList<Int>()

        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(0,15)
        lottoNumArr.add(17)

        Log.d("로또넘버 입력한 개수", "${lottoNumArr.size} 개 입력됨")
        Log.d("로또넘버 목록", "${lottoNumArr.toString()}")
        Log.d("42의 인덱스", "${lottoNumArr.indexOf(42)}")
        Log.d("1번칸에는 뭐가 있을까용???", "${lottoNumArr.get(1)}")
        //42를 뺴고 싶을때
        lottoNumArr.remove(42)
        //45를 뺴고 싶을때
        lottoNumArr.remove(45)//아무 일도 발생 안함 return 값이 Boolean

        //맨 앞의 자료를 지우고 싶을때
        lottoNumArr.removeAt(0)




        val userList = ArrayList<User>()

        val user1: User = User()
        user1.name = "조경진"
        user1.loginId = "teacher"
        userList.add(user1)

        val user2 = User()
        user2.name = "계석준"
        user2.loginId = "stuent1"
        userList.add(user2)

        val user3 = User()
        user3.name = "김미현"
        user3.loginId = "stuent2"
        userList.add(user3)

        val user4 = User()
        user4.name = "Someone else"
        user4.loginId = "stuent3"
        userList.add(user4)

        Log.d("들어있는 사람수 ", "${userList.size} 명")
        var count = 0

//        //몇번이나 돌아야할지 모를때 사용하는 while
//        while (true){
//            count++
//            if(count >= 10){
//                break
//            }
//        }

        //코틀린에서는 JAVA의 for each 와 비슷한 문법이 기본.

        for (user in userList)
            Log.d("사람이름/아이디 : " , "${user.name}/ ${user.loginId}")

        val endnum = 5
        for (i in 0..endnum)
            Log.d("뽑신 숫자 : " , "${i}")
            Log.d("뽑는 배열 크기 : " , "${endnum}")


        val user5:User? = null
        val user6:Any?
        val user7 = null




    }
}
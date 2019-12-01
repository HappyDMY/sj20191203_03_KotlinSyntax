package com.tjoeun.sj20191203_03_kotlinsyntax.datas

class User{

    var name = ""
    var loginId =""
    override fun equals(other: Any?): Boolean {
        val otherUser = other as User
        return this.name == otherUser.name && this.loginId == otherUser.loginId
    }

}
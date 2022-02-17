package com.kthomas.project0.driver;

import com.kthomas.project0.dao.v_roomDAO;
import com.kthomas.project0.model.v_map;
import com.kthomas.project0.model.v_room;
import com.kthomas.project0.util.KTConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Playloop {

    public static Connection conn = KTConnectionUtil.getConnection();

    static v_map catacomb = null;
    static int wherePlayer = 0;

    public Playloop() {
        try {
            v_roomDAO catacombdao = new v_roomDAO();
            catacomb = catacombdao.getV_room();
        } catch (SQLException e) {

        }

    }

    public static void Dotheloop(){
        //Now we just have to loop a player interface and respond.
        v_room checkroom = catacomb.getRoom(wherePlayer);
        System.out.println(checkroom.getRoomdesc());
    }
}

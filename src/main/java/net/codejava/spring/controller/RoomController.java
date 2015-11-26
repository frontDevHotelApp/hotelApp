package net.codejava.spring.controller;

import net.codejava.spring.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/rooms")
public class RoomController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView viewRoomsList(HttpServletRequest request, HttpServletResponse response) {
        List<Room> rooms = new ArrayList<>();
        Room room1 = new Room("5", "hotel plaza", "Pokój lux z łazienką");
        Room room2 = new Room("1", "hotel bis", "Pokój standard");
        Room room3 = new Room("2", "hotel alfa", "Pokój lux");
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Map<String, Object> model = new HashMap<>();
        model.put("rooms", rooms);

        return new ModelAndView("RoomList", "rooms", rooms);
    }
}

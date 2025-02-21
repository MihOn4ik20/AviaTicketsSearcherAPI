/*
 * Controller for processing user information
 * Developers: Panov K.D. ;
 * Last change: february 2025
 */

package com.avia.tickets.searching.controllers;


import com.avia.tickets.searching.models.ValueLong;
import com.avia.tickets.searching.response.Response;
import com.avia.tickets.searching.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    UserService userService;
    public Response getInternalUserIdViaTelegramId(@RequestParam long telegramId) {
        Response response = Response.builder()
                .setCode(200)
                .setStatus("OK")
                .setDescription("users internal id")
                .setResponseBody(new ValueLong(userService.getUserIdViaTelegramId(telegramId)))
                .build();
        return response;
    }

}

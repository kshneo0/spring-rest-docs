package com.rest.docs.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * fileName : MemberApiTest
 * author :  KimSangHoon
 * date : 2022/12/10
 */
@SpringBootTest
@AutoConfigureMockMvc
class MemberApiTest {
    /**
     * 1. Member 단일 조회
     * 2. Member 생성 -> 완료
     * 3. Member 수정
     * 4. Member 페이징 조회
     */

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void member_page_test() throws Exception {
        mockMvc.perform(
                get("/api/members")
                        .param("size", "10")
                        .param("page","0")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void member_page_get() throws Exception {
        mockMvc.perform(
                        get("/api/members/{id}",1L)
                                .contentType(MediaType.APPLICATION_JSON)
                ).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void member_create() throws Exception {
        mockMvc.perform(
                        post("/api/members")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "  \"email\": \"bbb@bbb.com\",\n" +
                                        "  \"name\": \"bbb\"\n" +
                                        "}")
                ).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void member_modify() throws Exception {
        mockMvc.perform(
                        put("/api/members/{id}",1L)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "  \"name\": \"new-yun\"\n" +
                                        "}")
                ).andDo(print())
                .andExpect(status().isOk());
    }
}
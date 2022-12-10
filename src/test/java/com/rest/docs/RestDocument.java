package com.rest.docs;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * fileName : RestDocumentApi
 * author :  KimSangHoon
 * date : 2022/12/10
 */
public class RestDocument extends TestSupport {


    @Test
    public void sampleRequest() throws Exception {
        mockMvc.perform(
                        post("/test/sample")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n"
                                        + "  \"email\": \"zobbb.com\",\n"
                                        + "  \"name\": \"\"\n"
                                        + "}")
                )
                .andExpect(status().isBadRequest())
                .andDo(
                        restDocs.document(
                                responseFields(
                                        fieldWithPath("message").description("에러 메시지"),
                                        fieldWithPath("status").description("Http Status Code"),
                                        fieldWithPath("code").description("Error Code"),
                                        fieldWithPath("timestamp").description("에러 발생 시간"),
                                        fieldWithPath("errors").description("Error 값 배열 값"),
                                        fieldWithPath("errors[0].field").description("문제 있는 필드"),
                                        fieldWithPath("errors[0].value").description("문제가 있는 값"),
                                        fieldWithPath("errors[0].reason").description("문재가 있는 이유")
                                )
                        )
                )
        ;
    }

    @Test
    public void memberStatus() throws Exception {
        mockMvc.perform(
                        get("/test/memberStatus")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
        ;
    }
}

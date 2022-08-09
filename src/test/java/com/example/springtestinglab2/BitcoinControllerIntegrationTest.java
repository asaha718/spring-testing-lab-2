package com.example.springtestinglab2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@AutoConfigureMockMvc
public class BitcoinControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private BitcoinService bitcoinService;

    @WithMockUser
    @Test
    void getBitcoinPrice() throws Exception{
        mockMvc.perform(get("/bitprice"))
                .andDo(print())
                .andExpect(status().isOk());

    }

}

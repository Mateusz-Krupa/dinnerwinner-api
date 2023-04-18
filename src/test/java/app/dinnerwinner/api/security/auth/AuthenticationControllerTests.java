package app.dinnerwinner.api.security.auth;
import app.dinnerwinner.api.recipe.services.RecipeService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.any;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticationControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private AuthenticationService authService;

  @InjectMocks
  private AuthenticationController controller;

//  @Test
//  public void testRegister() {
//    RegisterRequest request = new RegisterRequest("John", "Doe", "johndoe@example.com", "mypassword");
//    AuthenticationResponse expectedResponse = new AuthenticationResponse("token", "refreshToken");
//
//    given(authService.register(any(RegisterRequest.class))).willReturn(expectedResponse);
//
//    ResponseEntity<AuthenticationResponse> response = controller.register(request);
//
//    assertEquals(expectedResponse, response.getBody());
//    assertEquals(HttpStatus.OK, response.getStatusCode());
//  }

//  @Test
//  public void testAuthenticate() throws Exception {
//    AuthenticationRequest request = new AuthenticationRequest("testuser", "testpassword");
//    AuthenticationResponse response = new AuthenticationResponse("token", "refreshToken");
//
//    given(authService.authenticate(request)).willReturn(response);
//
//    mockMvc.perform(post("/api/v1/auth/authenticate")
//        .contentType(MediaType.APPLICATION_JSON)
//        .content(asJsonString(request)))
//      .andExpect(status().isOk())
//      .andExpect(jsonPath("$.token").value("token"))
//      .andExpect(jsonPath("$.refreshToken").value("refreshToken"));
//  }
//
//  @Test
//  public void testRefreshToken() throws Exception {
//    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
//    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
//
//    doNothing().when(authService).refreshToken(mockRequest, mockResponse);
//
//    mockMvc.perform(post("/api/v1/auth/refresh-token")
//        .contentType(MediaType.APPLICATION_JSON))
//      .andExpect(status().isOk());
//
//    verify(authService, times(1)).refreshToken(mockRequest, mockResponse);
//  }
//
//  private String asJsonString(final Object obj) {
//    try {
//      final ObjectMapper mapper = new ObjectMapper();
//      return mapper.writeValueAsString(obj);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }
//  }

}

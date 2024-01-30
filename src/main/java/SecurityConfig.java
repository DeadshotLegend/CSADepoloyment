import org.springframework.context.annotation.Configuration;


@Configuration
public class SecurityConfig extends sample_class {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .addFilter(new JwtAuthenticationFilter(authenticationManager()))
            // Request Matcher for All Requests:
            .antMatchers("/**").permitAll();
            //Request Matcher for Authentication
            .antMatchers("/api/private/**").authenticated();


    }

    private Object antMatchers(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'antMatchers'");
    }
}

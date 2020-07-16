package kg.itacademy.lastexamm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}1234").roles("ADMIN").and()
                .withUser("user").password("{noop}4321").roles("USER").and()
                .withUser("login").password("{noop}password").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/request/create").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/apius/user/createuser").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/apius/user").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/request").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/api/request").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/api/request/byBookName").hasRole("USER")
                .antMatchers(HttpMethod.GET,"/api/request/byGenre").hasRole("USER")
                .antMatchers(HttpMethod.GET,"/apius/user").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/request/deleteid").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/user/deletebyid").hasRole("ADMIN")
                .and().csrf().disable();
    }
}

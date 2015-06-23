package by.academy.it.controller;

import by.academy.it.pojo.BodyStyle;
import by.academy.it.service.IBodyStyleService;
import by.academy.it.to.impl.BodyStyleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/bodystyle")
public class BodyStyleController {

    @Autowired
    IBodyStyleService bodyStyleService;

    @RequestMapping(value = "/form.do", method = RequestMethod.GET)
    public String addBodyStyleForm(Model model) {
        return "add_body_style";
    }

    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public String addBodyStyle(
            @RequestParam("name_body_style") String nameBodyStyle,
            Model model) {
        BodyStyle bodyStyle = new BodyStyle();
        bodyStyle.setNameBodyStyle(nameBodyStyle);
        bodyStyleService.addBodyStyle(bodyStyle);
        return "auto_switch";
    }

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public ModelAndView listBodyStyles() {
        List<BodyStyle> bodyStyleList = bodyStyleService.getBodyStyles();
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("body_styles", prepareBodyStyleBean(bodyStyleList));
        return new ModelAndView("body_style_list", model);
    }

    @RequestMapping(value = "/remove.do", method = RequestMethod.GET)
    public String removeBodyStyle(
            @RequestParam("id_body_style") int idBodyStyle,
            Model model) {
        BodyStyle bodyStyle = bodyStyleService.getBodyStyleById(idBodyStyle);
        bodyStyleService.removeBodyStyle(bodyStyle);
        return "auto_switch";
    }

    private List<BodyStyleBean> prepareBodyStyleBean(List<BodyStyle> bodyStyleList) {
        List<BodyStyleBean> bodyStyleBeanList = new ArrayList<BodyStyleBean>();
        for (BodyStyle bodyStyle : bodyStyleList) {
            BodyStyleBean bodyStyleBean = new BodyStyleBean();
            bodyStyleBean.setIdBodyStyle(bodyStyle.getIdBodyStyle());
            bodyStyleBean.setNameBodyStyle(bodyStyle.getNameBodyStyle());
            bodyStyleBeanList.add(bodyStyleBean);
        }
        return bodyStyleBeanList;
    }
}

/*    @RequestMapping(value = "/form.do", method = RequestMethod.GET)
    public String addUserForm(Model model) {
        return "addUserForm";
    }

    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public String addUser(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {
        userService.addUser(email, password);
        return "redirect:/index.do";
    }

    @RequestMapping(value = "/user-details.do", method = RequestMethod.POST)
    public String addUserDetails(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("telephone") String telephone,
            @RequestParam("id") String id
    ) {
        userService.addUserDetails(id, firstName, lastName, telephone);
        return "index";
    }*/

public class ColourChecking {
    int red=193,green=255,blue=183;
    double hue=0,saturation=0,brightness=0,luma;
    public void display()
    {
        luma=0.3*red+0.59*green+0.11*blue;
        if(green>red && green>blue)
        {
            hue=2.0+((blue-green)/(255-183));
            brightness=(255+183)/2;
            if (luma<128)
            {
                saturation=(255*(255-183))/(255+183);
            }
            else {
                saturation=(255*(255-183))/(511-(255+183));
            }
        }
        else if (red>green && red>blue) {
            hue=((green-blue)/(255-183));
            brightness=(255+183)/2;
            if (luma<128)
            {
                saturation=(255*(255-183))/(255+183);
            }
            else {
                saturation=(255*(255-183))/(511-(255+183));
            }
        }
        else if (blue>green && red<blue) {
            hue=4.0+((red-green)/(255-183));
            brightness=(255+183)/2;
            if (luma<128)
            {
                saturation=(255*(255-183))/(255+183);
            }
            else {
                saturation=(255*(255-183))/(511-(255+183));
            }
        }
        else{
            hue=0;
            saturation=0;
            brightness=(255+183)/2;
        }
        System.out.println("Hue : "+hue+"\n"+"Saturation :"+saturation+"\n"+"Brightness : "+brightness);

    }

}

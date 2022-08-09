package string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void firstTestGetLargestStringFromArray() {
        String[] testStrings = new String[]{
                "В целом, конечно, убеждённость некоторых оппонентов обеспечивает широкому кругу (специалистов)",
                "участие в формировании переосмысления внешнеэкономических",
                "политик. Учитывая ключевые сценарии поведения, постоянный количественный",
                "рост и сфера нашей активности однозначно фиксирует",
                "необходимость модели развития. Также как дальнейшее развитие различных",
                "форм деятельности влечет за собой процесс внедрения и модернизации поставленных",
                "обществом задач. Разнообразный и богатый опыт говорит нам, что высокотехнологичная концепция общественного",
                "уклада выявляет срочную потребность новых предложений. Есть над чем задуматься: представители",
                "современных социальных резервов, превозмогая сложившуюся непростую экономическую ситуацию, преданы",
                "социально-демократической анафеме."
        };

        BigString expected = new BigString(106,
                "обществом задач. Разнообразный и богатый опыт говорит нам, что высокотехнологичная концепция общественного");

        BigString result = StringUtils.getTheBiggestStringFromArray(testStrings);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondTestGetLargestStringFromArray() {
        BigString expected = new BigString(0, "");
        BigString result = StringUtils.getTheBiggestStringFromArray(new String[0]);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdTestGetLargestStringFromArray() {
        BigString expected = new BigString(0, "");
        BigString result = StringUtils.getTheBiggestStringFromArray(new String[1]);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fourthTestGetLargestStringFromArray() {
        BigString expected = new BigString(0, "");
        BigString result = StringUtils.getTheBiggestStringFromArray(null);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fifthTestGetLargestStringFromArray() {
        String[] testStrings = new String[]{
                "В целом, конечно, убеждённость некоторых оппонентов обесп",
                "участие в формировании переосмысления внешнеэкономических"
        };

        BigString expected = new BigString(57, "В целом, конечно, убеждённость некоторых оппонентов обесп");
        BigString result = StringUtils.getTheBiggestStringFromArray(testStrings);

        Assert.assertEquals(expected, result);
    }
}
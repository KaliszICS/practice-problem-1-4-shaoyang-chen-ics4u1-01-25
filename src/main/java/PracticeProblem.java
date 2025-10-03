import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static String getName(int line, String fileName) {
        if (line <= 0) {
            return "";
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String wantedLine;
            int wantedLineNumber = 0;
            while ((wantedLine = br.readLine()) != null) {
                wantedLineNumber++;
                if (wantedLineNumber == line) {
                    String[] parts = wantedLine.split(" ");
                    if (parts.length >= 2) {
                        return parts[0] + " " + parts[1];
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
            return "";
        }
        return "";
    }

    public static int getAge(int line, String fileName) {
        if (line <= 0) {
            return -1;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String wantedLine;
            int wantedLineNumber = 0;
            while ((wantedLine = br.readLine()) != null) {
                wantedLineNumber++;
                if (wantedLineNumber == line) {
                    String[] parts = wantedLine.split(" ");
                    if (parts.length >= 3) {
                        return Integer.parseInt(parts[2]);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
            return -1;
        }
        return -1;
    }

    public static int getNumber(int line, String fileName) {
        if (line <= 0) {
            return -1;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String wantedLine;
            int wantedLineNumber = 0;
            while ((wantedLine = br.readLine()) != null) {
                wantedLineNumber++;
                if (wantedLineNumber == line) {
                    String[] parts = wantedLine.split(" ");
                    if (parts.length >= 4) {
                        return Integer.parseInt(parts[3]);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
            return -1;
        }
        return -1;
    }

    public static void fileAppend(String output, String fileName) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(output);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}

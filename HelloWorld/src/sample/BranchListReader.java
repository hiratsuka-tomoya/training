package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BranchListReader {

	//リストファイル名
	final String FILE_NAME_BRANCH = "branch.lst";

	//リストファイルのフォルダ
	String folderPath;

	BranchListReader(String folderPath){
		this.folderPath = folderPath;
	}

	//支店定義ファイルを読み込み、ArrayList<Branch>を返す
	public ArrayList<Branch> getBranchList(){

		//ファイルパスを取得
		String filePath = new String();
		filePath = folderPath + "\\" + FILE_NAME_BRANCH;

		ArrayList<Branch> branchList = new ArrayList<Branch>();

		//リストファイルを読み込む
		try{
			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String strLine;
			//ファイル末尾まで一行ずつ読み込む
			while((strLine = br.readLine()) != null) {
				//一行をカンマで分割して、コード,名前をbranchListに登録
				String[] strSplit = strLine.split(",",0);
				Branch branch = new Branch();
				branch.setCode(Integer.parseInt(strSplit[0]));
				branch.setName(strSplit[1]);
				branchList.add(branch);
				//dbgPrint
				System.out.println(branchList.get(branchList.size()-1).getCode()
									+ branchList.get(branchList.size()-1).getName());
			}
			br.close();
		}catch(FileNotFoundException e){
			  System.out.println(e);
		}catch(IOException e){
			  System.out.println(e);
		}

		return branchList;

	}



}

package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	 public static int calculateTax(TaxData data) {
		int taxableIncome = (data.monthlySalary + data.otherMonthlyIncome) * data.monthWorkingInYear - data.annualDeductible;
		int tax = 0;
	
		if (data.isSingle) {
			tax = (int) Math.round(0.05 * taxableIncome);
		} else {
			tax = (int) Math.round(0.05 * taxableIncome - 1000000);
		}
	
		tax -= data.numberOfChildren * 250000;
	
		if (tax < 0) tax = 0;
		return tax;
	}
	